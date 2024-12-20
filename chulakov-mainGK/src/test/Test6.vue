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
      <img src="/public/window.png" alt="">

      <button class="language-button" @click="correct()">Window</button>
      <button class="language-button" @click="wrong()">Glass</button>
      <button class="language-button" @click="wrong()">Water</button>

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
    goToNextPage() {
      localStorage.setItem("progress", this.progress);
      this.$router.push('/next6');
    },
    async request(score) {
      const jwt = this.$cookies.get('jwt');

      let params = {
        weight: score,
        stage: 3
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
    },
    correct() {
      this.request(1);
    },
    wrong() {
      this.request(0);
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
}

.language-button {
  background-color: #205A54; 
  color: white; 
  border: 2px solid white; 
  padding: 20px 40px; 
  font-size: 1.5rem; 
  cursor: pointer;
  margin-bottom: 15px ; 
  font-weight: bold;
  width: 400px;
  text-align: center; 

}

.language-button:hover {
  background-color: #047D71; 
  border-color: #047D71; 
}

.aaa{
  color: aliceblue;
}

</style>
