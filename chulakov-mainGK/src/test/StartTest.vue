<template>
  <div class="background-container">
    <div class="logo">
      <img src="/public/лого.png" alt="Логотип" />
      <div class="underline"></div>
      <div class="progress-bar-background">
        <div class="progress-bar" :style="{ transform: 'scaleX(' + (progress / 100) + ')', transformOrigin: 'left' }"></div>
      </div>
    </div>
    <div class="question">
      <img src="/public/sam-vopros.png" alt="Сам вопрос" />
    </div>
    <button class="next-button" @click="goToNextPage()">Далее</button>
  </div>
</template>

<script>
export default {
  name: "StartTest",
  data() {
    return {
      progress: 0, 
      maxProgress: 100, 
      increment: 10, 
    };
  },
  created() {
    this.progress = 0;
    localStorage.setItem("progress", 0);
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
      this.$router.push('/next');
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

.next-button {
  position: absolute;
  bottom: 20px; 
  background-color: #E38D23; 
  border: none;
  padding: 15px 40px;
  font-size: 1.2rem;
  cursor: pointer;
  border-radius: 5px;
  color: white; 
  font-weight: bold;
}

.next-button:hover {
  background-color: #d77b0f; 
}

.question img {
  margin-top: 50px;
}

.answers img {
  margin-top: 20px;
  width: 450px; 
  height: auto;
}
</style>
