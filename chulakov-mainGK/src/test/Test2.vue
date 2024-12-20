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
      <button class="language-button" @click="setRussian()">Русский</button>
      <button class="language-button" @click="setEnglish()">English</button>
      <button class="language-button" @click="setFrench()">French</button>
      <button class="language-button" @click="setItalian()">Italian</button>
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
      this.$router.push('/next2');
    },
    async request(language) {
      const jwt = this.$cookies.get('jwt');
      try {
        const response = await api.post("/main/user/setLang", null, {
          params: { language },
          headers: {
            'Authorization': 'Bearer ' + jwt
          }
        });
        this.goToNextPage();
      } catch (error) {
        console.log(error);
      }
    },
    setRussian() {
      this.request("russian");
    },
    setEnglish() {
      this.request("english");
    },
    setFrench() {
      this.request("french");
    },
    setItalian() {
      this.request("italian");
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
  margin-top: 30px;
}

.language-button {
  background-color: #205A54; 
  color: white; 
  border: 2px solid white; 
  padding: 20px 40px; 
  font-size: 1.5rem; 
  cursor: pointer;
  margin: 15px 0; 
  font-weight: bold;
width: 400px;
  text-align: center; 
  margin-top: 60px;
}

.language-button:hover {
  background-color: #047D71; 
  border-color: #047D71; 
}

</style>
