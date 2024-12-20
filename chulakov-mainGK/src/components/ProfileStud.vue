
<template>
  <HeaderBack/>
  <div>
    <main class="main-content">
      <section class="profile-section">
        <div class="profile-info">
          <img
            loading="lazy"
            src="https://cdn.builder.io/api/v1/image/assets/TEMP/5f5e3f21be7196c333d4032a00136e9dc46f3320e3c570fab365a341fb77ddb4?placeholderIfAbsent=true&apiKey=9cc457d3ae444a0cbe54d30aad64c049"
            class="profile-photo"
            alt="User profile photo"
          />
          <div class="profile-details">
            <div class="info-card">
              <h2 class="info-title">Информация:</h2>
              <p class="info-text">
                {{ username }} Возраст: {{ age }} Описание: {{ info }}
              </p>
            </div>
            <router-link to="/userprofile"><button class="edit-profile-btn" tabindex="0">Изменить профиль</button></router-link>
          </div>
        </div>
        <div class="progress-card">
          <div class="progress-circle">
            <div class="progress-content">

              <div class="progress-stats">
                <span>Выполнено</span>
                <span class="progress-number">2/8</span>
                <span class="progress-label">уроков</span>
              </div>
            </div>
          </div>
          <p class="progress-message">Выполни все 8 уроков и получи награду</p>
        </div>
      </section>



      <section class="learning-section">
        <div class="course-info">
          <h3 class="course-title">Вы изучаете: {{ language }}</h3>
          <div class="level-indicator">
            <span class="level-text">Уровень языка: {{ languageLevel }}</span>
            <img
              loading="lazy"
              src="https://cdn.builder.io/api/v1/image/assets/TEMP/df7d02e1e9854fa77adc44f6f2ade1e59cb0d256bb1830ad890e079f317faa2c?placeholderIfAbsent=true&apiKey=9cc457d3ae444a0cbe54d30aad64c049"
              class="level-icon"
              alt="Level indicator"
            />
          </div>
          <h4 class="updates-title">Последние сведения от пеподавателей:</h4>
          <div class="updates-card">
            <p class="update-item">Дз: упр 43 (Игорь Васильев - английский язык)</p>
            <p class="update-item">
              Следующий урок 18.12 - 12:00 - (Дарья Малюк - французкий)
            </p>
          </div>
        </div>
        <div class="vocabulary-stats">
          <div class="stats-card">
            <div class="stats-header">
              <img
                loading="lazy"
                src="https://cdn.builder.io/api/v1/image/assets/TEMP/5d6e2304afc5ba396ed6586559214901a73538f04ec3d54ae7b6db3a823eea0a?placeholderIfAbsent=true&apiKey=9cc457d3ae444a0cbe54d30aad64c049"
                class="stats-icon"
                alt="Vocabulary statistics icon"
              />
              <span class="stats-number">27</span>
            </div>
            <p class="stats-description">Слов ты выучил на данный момент</p>
          </div>
          <div class="stats-chart"></div>
        </div>
      </section>
    </main>


    <footer class="footer">
      <h2 class="lesson-title">УРОК С ПРЕПОДАВАТЕЛЕМ</h2>
    </footer>
    <form class="lesson-form" @submit.prevent="handleSubmit">
    <div class="input-group">
      <label for="uniqueKey" class="visually-hidden">Введите уникальный ключ</label>
      <input
        type="text"
        id="uniqueKey"
        class="input-field"
        v-model="uniqueKey"
        aria-label="Введите уникальный ключ"
      />
    </div>

    <div class="input-group">
      <label for="lessonNumber" class="visually-hidden">Введите номер урока</label>
      <input
        type="number"
        id="lessonNumber"
        class="input-field"
        v-model="lessonNumber"
        aria-label="Введите номер урока"
      />
    </div>

    <button type="submit" class="start-button" tabindex="0">
      Начать урок
    </button>
  </form>

  <div class="sec">
  <section class="registration-steps">
    <h1 class="registration-title">
      Как записаться на урок с преподавателем?
    </h1>
    <div class="step-container">
      <img
        loading="lazy"
        src="https://cdn.builder.io/api/v1/image/assets/TEMP/e713b589dadfe7cdb8c585edbec7c810350a57d4e77b8981a6a7e083bfa7cda7?placeholderIfAbsent=true&apiKey=9cc457d3ae444a0cbe54d30aad64c049"
        alt="Step 1: Access personal account"
        class="step-icon"
      />
      <p class="step-text">Перейдите в личный кабинет</p>
    </div>
    <div class="step-container">
      <img
        loading="lazy"
        src="https://cdn.builder.io/api/v1/image/assets/TEMP/e713b589dadfe7cdb8c585edbec7c810350a57d4e77b8981a6a7e083bfa7cda7?placeholderIfAbsent=true&apiKey=9cc457d3ae444a0cbe54d30aad64c049"
        alt="Step 2: Select teacher"
        class="step-icon"
      />
      <p class="step-text">
        Нажмите "<span class="highlight-text">Выбрать преподавателя</span>"
      </p>
    </div>
    <div class="step-container">
      <img
        loading="lazy"
        src="https://cdn.builder.io/api/v1/image/assets/TEMP/e713b589dadfe7cdb8c585edbec7c810350a57d4e77b8981a6a7e083bfa7cda7?placeholderIfAbsent=true&apiKey=9cc457d3ae444a0cbe54d30aad64c049"
        alt="Step 3: Indicate knowledge level"
        class="step-icon"
      />
      <p class="step-text">Укажите свой уровень знаний</p>
    </div>
    <div class="step-container">
      <img
        loading="lazy"
        src="https://cdn.builder.io/api/v1/image/assets/TEMP/e713b589dadfe7cdb8c585edbec7c810350a57d4e77b8981a6a7e083bfa7cda7?placeholderIfAbsent=true&apiKey=9cc457d3ae444a0cbe54d30aad64c049"
        alt="Step 4: Adjust date and time"
        class="step-icon"
      />
      <p class="step-text">Скорректируйте дату и время урока</p>
    </div>
    <div class="step-container">
      <img
        loading="lazy"
        src="https://cdn.builder.io/api/v1/image/assets/TEMP/e713b589dadfe7cdb8c585edbec7c810350a57d4e77b8981a6a7e083bfa7cda7?placeholderIfAbsent=true&apiKey=9cc457d3ae444a0cbe54d30aad64c049"
        alt="Step 5: Join lesson on time"
        class="step-icon"
      />
      <p class="step-text">Подключитесь вовремя на занятие</p>

    </div>



  </section>
  <img
        src="/public/girl_profile.png"
        class="girl_profile"
      />
</div>


  </div>
  <TheFooter/>
</template>

<script>
import HeaderBack from './HeaderBack.vue';
import TheFooter from './TheFooter.vue';

export default {
  name: 'LessonForm',
  data() {
    return {
      uniqueKey: '',
      lessonNumber: '',
      username: '',
      age: '',
      info: '',
      language: '',
      languageLevel: '',
    }

  },
  methods: {
    handleSubmit() {
      if (this.uniqueKey && this.lessonNumber) {
        this.$emit('start-lesson', {
          key: this.uniqueKey,
          lesson: this.lessonNumber
        })
      }
    }, 
    calculateAge(dateOfBirth) {
        const birthDate = new Date(dateOfBirth); 
        const today = new Date(); 
        let age = today.getFullYear() - birthDate.getFullYear(); 
        const monthDifference = today.getMonth() - birthDate.getMonth(); 

        if (monthDifference < 0 || (monthDifference === 0 && today.getDate() < birthDate.getDate())) {
            age--; 
        }

        if (Number.isNaN(age)) return "Неизвестно"

        return age; 
    }
  },
  components: {
    HeaderBack,
    TheFooter
  },
  mounted() {
    const token = this.$cookies.get('jwt');

    const base64Url = token.split('.')[1];
    const base64 = base64Url.replace(/-/g, '+').replace(/_/g, '/');
    const decodedToken = JSON.parse(decodeURIComponent(escape(window.atob(base64))));

    this.username = decodedToken.username;
    this.age = this.calculateAge(decodedToken.dateOfBirth);
    this.info = decodedToken.info;
    this.language = decodedToken.language;
    this.languageLevel = decodedToken.languageLevel;
  },
}
</script>

<style scoped>

.sec{
  display: flex;
    column-gap: 0%;
    width: 80%;
    margin: 0 auto;
}

.girl_profile{
  width: 50%;
}


.header {
  width: 100%;
  max-width: 1360px;
  margin: 0 auto;
  display: flex;
  justify-content: space-between;
  align-items: center;
}

.language-selector {
  display: flex;
  gap: 27px;
  align-items: center;
  color: rgb(32, 90, 84);
  font: 400 30px Roboto, sans-serif;
}

.language-icon {
  width: 54px;
  height: 54px;
  border-radius: 50%;
  object-fit: contain;
}

.header-content {
  display: flex;
  justify-content: space-between;
  align-items: center;
  width: 77%;
}

.brand-logo {
  display: flex;
  align-items: center;
  gap: 9px;
  color: rgb(32, 90, 84);
  font: 400 32px 'Seymour One', sans-serif;
}

.brand-icon {
  width: 126px;
  object-fit: contain;
}

.account-text {
  color: rgb(32, 90, 84);
  font: 400 30px Roboto, sans-serif;
}

.main-content {
  margin-top: 109px;
}

.profile-section {
  display: flex;
    gap: 20px;
    margin-bottom: 10px;
    width: 80%;
    margin: 0 auto;
}

.profile-info {
  display: flex;
    gap: 20px;
    width: 72%;
    margin-bottom: 0;
}

.profile-photo {
  width: 50%;
  height: 50%;
  aspect-ratio: 1;
  border-radius: 50%;

  object-fit: contain;
}

.info-card {
  background: rgb(255, 239, 217);
  border-radius: 25px;
  padding: 39px 30px;
  box-shadow: 0 4px 4px rgba(0, 0, 0, 0.25);
}

.info-title {
  color: rgb(32, 90, 84);
  font: 500 28px Roboto, sans-serif;
  text-align: center;
}

.info-text {
  color: rgb(99, 99, 99);
  font: 400 24px Poppins, sans-serif;
  margin-top: 52px;
}

.edit-profile-btn {
  background: rgb(32, 90, 84);
  color: white;
  border: none;
  border-radius: 32px;
  padding: 21px 50px;
  font: 400 22px Poppins, sans-serif;
  cursor: pointer;
  margin-top: 20px;
  position: relative;
    top: -10%;
    left: 51%;
}

.progress-card {
  width: 28%;
  background: rgb(248, 230, 204);
  border-radius: 40px;
  padding: 17px;
  text-align: center;
}

.progress-circle {
  border: 23px solid rgb(121, 191, 173);
  border-radius: 50%;
  position: relative;
  aspect-ratio: 1;
}

.stats-header{
  align-items: center;
  display: flex;
}

.progress-message{
  color: #205A54;
    font-size: 1.1rem;
    margin: 0 auto;
    padding-top: 5%;
}

.progress-content {
  position: relative;
  height: 100%;
  display: flex;
  align-items: center;
  justify-content: center;
}

.progress-stats {
  position: absolute;
  background: rgb(248, 230, 204);
  border-radius: 50%;
  padding: 33px;
  display: flex;
  flex-direction: column;
  align-items: center;
  color: rgb(32, 90, 84);
  font: 800 18px Roboto, sans-serif;
}

.progress-number {
  font-size: 68px;
  font-weight: 200;
  color: black;
  margin: 28px 0;
}

.learning-section {

  display: flex;
    gap: 20px;
    margin-left: 5%;
    margin-top: 10px;
    margin: 1% auto;
    width: 80%;

}

.course-info {
  width: 69%;
  color: rgb(227, 141, 35);
  font: 400 31px Roboto, sans-serif;
  margin-top: -12.7%;
}

.level-indicator {
  background: rgb(236, 213, 181);
  border-radius: 35px;
  padding: 19px 28px;
  display: flex;
  justify-content: space-between;
  align-items: center;
  width: 400px;
  margin-top: 43px;
  color: rgb(11, 125, 113);
  font-size: 24px;
}

.updates-card {
  background: white;
  border-radius: 44px;
  padding: 32px 25px;
  margin-top: 21px;
  font-size: 28px;
  color: rgb(183, 88, 7);
}

.vocabulary-stats {
  width: 31%;
}

.stats-card {
  background: rgb(248, 230, 204);
  border-radius: 40px;
  padding: 47px;
  text-align: center;
}

.stats-number {
  font-size: 91px;
  color: black;
}

.stats-description {
  color: rgb(183, 88, 7);
    font-size: 1.1rem;
    margin: 0 auto;
    padding-top: 5%;
}

.footer {

  text-align: center;
  margin-top: 29px;

}

.lesson-title {
  color: rgb(183, 88, 7);
  font: 900 33px Roboto, sans-serif;
}

.lesson-form {
  align-self: stretch;
  display: flex;
  gap: 100px;
  color: rgba(0, 0, 0, 0.44);
  flex-wrap: wrap;
  margin-left: 15%;
  font: 300 25px Roboto, sans-serif;
}
.input-field {
  border-radius: 43px;
  background-color: #fff;
  padding: 31px 34px;
  border: 2px solid rgb(32, 90, 84);
  width: 100%;
  font: inherit;
}

.start-button {
  border-radius: 43px;
  background-color: rgb(118, 185, 178);
  color: #fff;
  font-weight: 800;
  text-align: center;
  padding: 31px 70px;
  border: none;
  cursor: pointer;
}

.start-button:focus {
  outline: 2px solid rgb(32, 90, 84);
  outline-offset: 2px;
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

.registration-steps {
  border-radius: 30px; /* Уменьшен радиус скругления */
  background: #fff;
  display: flex;
  width: 80%; /* Установите фиксированную ширину или процент */
  max-width: 600px; /* Ограничьте максимальную ширину */
  flex-direction: column;
  align-items: start;
  color: #000;
  margin: 0 auto;
  padding: 20px 25px; /* Уменьшены внутренние отступы */
  font: 300 20px Roboto, sans-serif; /* Уменьшен размер шрифта */
  margin-top: 80px;
}
.registration-title {
  color: #E38D23;
  font-size: 27px;
  font-weight: 800;
  text-align: center;
  align-self: end;
}

.step-container {
  display: flex;
  margin-top: 50px;
  gap: 7px;
  flex-wrap: wrap;
}

.step-icon {
  aspect-ratio: 1;
  object-fit: contain;
  object-position: center;
  width: 73px;
}

.step-text {
  flex: 1;
  margin: auto 0;
}

.highlight-text {
  text-decoration: underline;
  color: #B75807;
}

hero-image {
  aspect-ratio: 0.78;
  object-fit: contain;
  object-position: center;
  width: 100%;
  margin: 29px 0 0;
  flex-grow: 1;
}
@media (max-width: 991px) {
  .page-container {
    padding: 0 20px;
  }

  .header,
  .main-content,
  .profile-section,
  .learning-section {
    flex-direction: column;
  }

  .profile-info,
  .progress-card,
  .course-info,
  .vocabulary-stats {
    width: 100%;
  }

  .profile-photo {
    width: 100%;
    margin-top: 33px;
  }

  .info-card {
    padding: 20px;
  }

  .progress-stats {
    padding: 20px;
  }

  .progress-number {
    font-size: 40px;
  }

  .level-indicator {
    width: 100%;
    padding: 20px;
  }

  .updates-card {
    padding: 20px;
  }

  .stats-number {
    font-size: 40px;
  }
}
</style>
