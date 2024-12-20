<template>
  <div class="background-container">
    <div class="logo">
      <img src="/public/лого.png" alt="Логотип" />
      <div class="underline"></div>

      <div class="progress-bar-background">
        <div class="progress-bar" :style="{ transform: 'scaleX(' + (progress / 100) + ')', transformOrigin: 'left' }"></div>
      </div>
    </div>

    <div class="language-selection">
      <h1 class="aaa">Выберите верный ответ</h1>
      <img src="/public/bird.png" alt="">

      <form class="question-card" @submit.prevent>
        <label for="questionInput" class="visually-hidden"></label>
        <div class="question-content" role="textbox" tabindex="0" id="questionInput">
          <h2 class="text-24">Do you have a small</h2>
          <div id="input-container">
          <input
            v-for="(input, index) in inputs"
            :key="index"
            type="text"
            maxlength="1"
            class="input-field"
            v-model="input.value"
            ref="inputs"
            @input="handleInput(index)"
          />
          <h2 class="text-24">?</h2>
        </div>
        </div>
        <button class="language-button" @click="request()">Далее</button>


      </form>

    </div>
  </div>
</template>

<script>
import api from "../api.js";

export default {
  name: "NextPage",
  data() {
    return {
      progress: 0, 
      maxProgress: 100, 
      increment: 10, 
      inputs: Array.from({ length: 4 }, () => ({ value: '' })), 
    };
  },
  created() {
    const savedProgress = localStorage.getItem("progress");
    if (savedProgress) {
      this.progress = parseInt(savedProgress, 10);
    }

    this.fillProgress();
  },
  methods: {
    fillProgress() {
      if (this.progress < this.maxProgress) {
        this.progress += this.increment; 
        if (this.progress > this.maxProgress) {
          this.progress = this.maxProgress;
        }
        localStorage.setItem("progress", this.progress);
      }
    },
    handleInput(index) {
      if (this.inputs[index].value.length === 1 && index < this.inputs.length - 1) {
        this.$refs.inputs[index + 1].focus();
      }
      if (this.inputs[index].value.length === 0 && index > 0) {
        this.$refs.inputs[index - 1].focus();
      }
    },
    goToNextPage() {
      localStorage.setItem("progress", this.progress);
      this.$router.push('/next8');
    },
    async request() {
      const jwt = this.$cookies.get('jwt');

      let params = {
        weight: 1,
        stage: 5
      };

      try {
        const response = await api.post("/main/user/setLangLevel", null, {
          params: params,
          headers: {
            'Authorization': 'Bearer ' + jwt
          }
        });
        this.goToNextPage();
      } catch (error) {
        console.log(error);
      }
    }
  },
};
</script>

<style scoped>
html, body {
  margin: 0;
  padding: 0;
  width: 100vw;
  height: 100vh;
}

.background-container {
  background-image: url('/public/background.png');
  background-size: cover;
  background-position: center;
  background-repeat: no-repeat;
  background-attachment: fixed;
  width: 100vw;
  height: 100vh;
  display: flex;
  flex-direction: column;
  justify-content: flex-start;
  align-items: center;
  font-size: 2rem;
}

.logo {
  position: relative;
  top: 50px;
  display: flex;
  flex-direction: column;
  align-items: center;
}

.logo img {
  width: 450px;
  height: auto;
}

.underline {
  margin-top: 10px;
  width: 100vw;
  height: 2px;
  background-color: white;
}

.progress-bar-background {
  margin-top: 20px;
  width: 80%; 
  height: 10px;
  background-color: #205A54;
  border-radius: 5px;
  overflow: hidden; 
}

.progress-bar {
  height: 100%;
  background-color: white; 
  transform-origin: left; 
  transform: scaleX(0); 
  transition: transform 0.3s ease;
  border-radius: 5px;
}

.language-selection {
  display: flex;
  flex-direction: column;
  align-items: center;
  margin-top: 40px;
  margin-bottom: 50px;

}

.language-button {
  background-color: #FF9E40; 
  color: white; 
  border: 2px solid #FF9E40; 
  padding: 20px 40px; 
  font-size: 1.5rem; 
  cursor: pointer;
  font-weight: bold;
  width: 400px;
  text-align: center; 
  margin-top: 50px;
  margin: 0 auto;

}

.language-button:hover {
  background-color: #f07c09; 
  border-color: #f07c09; 
}

.aaa{
  color: aliceblue;
}

.visually-hidden {
  position: absolute;
  width: 1px;
  height: 1px;
  padding: 0;
  margin: -1px;
  overflow: hidden;
  clip: rect(0, 0, 0, 0);
  border: 0;
}

.question-card {
  border-radius: 30px;
  display: flex;
  width: 700px;
  flex-direction: column;
  color: rgba(255, 255, 255, 1);
  font: 600 24px Poppins, sans-serif;
}

.question-content {
  border-radius: 30px;
  background-color: rgba(4, 125, 113, 0.5);
  box-shadow: 0px 4px 4px rgba(0, 0, 0, 0.25);
  width: 100%;
  padding: 26px 27px 160px;
  border: 2px solid rgba(0, 163, 146, 1);
  display: flex;
  margin-bottom: 50px;
}

#input-container {
  display: flex;
  justify-content: space-between;
  width: 200px; 
}

.input-field {
  width: 40px; 
  height: 40px; 
  border: none;
  border-bottom: 2px solid rgb(255, 255, 255); 
  text-align: center; 
  font-size: 24px; 
  outline: none; 
  transition: border-color 0.3s;
  background-color: transparent;
  color: aliceblue;

}

.input-field:focus {
  border-bottom: 2px solid rgb(255, 255, 255); 
}

.text-24 {
  font-size: 22px;
  color: aliceblue;

}


</style>
