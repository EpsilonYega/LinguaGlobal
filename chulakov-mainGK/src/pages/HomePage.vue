<template>
  <TheHeader />
  <main>
    <section class="girl">
      <img src="/public/chulacov_person.png" alt="Девушка с планшетом" class="intro-img" />
      <h1>{{ $t('welcomeMessage') }}</h1>
    </section>

    <section class="flag">
      <p class="ppp">{{ $t('chooseLanguage') }}</p>
      <div class="column-flag">
        <div class="flag-item">
          <router-link to="/profile">
            <img src="/public/us.png" alt="Английский" class="flag-img" />
          </router-link>
          <p>{{ $t('english') }}</p>
        </div>
        <div class="flag-item">
          <img src="/public/fr.png" alt="Французский" class="flag-img" />
          <p>{{ $t('french') }}</p>
        </div>
        <div class="flag-item">
          <img src="/public/ru.png" alt="Русский" class="flag-img" />
          <p>{{ $t('russian') }}</p>
        </div>
        <div class="flag-item">
          <img src="/public/it.png" alt="Итальянский" class="flag-img" />
          <p>{{ $t('italian') }}</p>
        </div>
      </div>
    </section>

    <section class="info">
      <h4>{{ $t('whyLearnLanguages') }}</h4>
      <div class="ingo1">
        <img src="/public/chulacov_info1.png" alt="info1" />
        <div class="info1_text">
          <h2>{{ $t('interactiveCommunity') }}</h2>
          <h1>{{ $t('learnTogether') }}</h1>
          <p>{{ $t('interactiveCommunityText') }}</p>
        </div>
      </div>
      <div class="ingo2">
        <img src="/public/chulacov_info2.png" alt="info2" />
        <div class="info2_text">
          <h2>{{ $t('studyConfidently2') }}</h2>
          <h1>{{ $t('studyConfidently') }}</h1>
          <p>{{ $t('studyConfidentlyText') }}</p>
        </div>
      </div>
    </section>

    <!-- Блок с призывом к действию -->
    <section class="join">
      <img src="/public/chulacov_join.png" alt="партнёры" />
      <h1>{{ $t('joinUs') }}</h1>
      <p>{{ $t('joinUsText') }}</p>
      <router-link to="/start">
        <button>{{ $t('startButton') }}</button>
      </router-link>
    </section>
  </main>
  <TheFooter />
</template>

<script>
import TheHeader from "../components/TheHeader.vue";
import TheFooter from "../components/TheFooter.vue";

export default {
  components: {
    TheHeader,
    TheFooter,
  },
};
</script>


  <style>

  main {
    margin: 0 auto;
  }

  .girl {
    display: flex;
    justify-content: center;
    padding: 60px;
    padding-top: 0;
    background-image: url('/chulacov_fon.png');
    background-size: cover;
    background-position: center;
    padding-bottom: 0;
  }

  .girl img {
    width: 36%;
  }

  .girl h1 {
    margin-top: 14%;
    font-size: 65px;
    max-width: 50%;
    color: #B75807;
    text-align: right;
    margin-right: 6%;
  }

  .flag {
  text-align: center;
  padding: 40px 0;
  padding-top: 0;
  border-bottom: 1px solid #B75807;
}

.flag p {
  font-size: 1.5rem;
  margin-bottom: 20px;
  color: #205A54;
}

.column-flag {
    display: flex;
    justify-content: center;
    flex-wrap: wrap;
    column-gap: 10%;
}

.flag-item {
  display: flex;
  flex-direction: column;
  align-items: center;
  text-align: center;
  cursor: pointer;
}

.flag-img {
  width: 100px;
  height: 60px;
  object-fit: contain;
  margin-bottom: 10px;
  margin-top: 15%;
}

.flag-item p {
  font-size: 1.1rem;
  color: #000;
}

.info h4{
    font-weight: bold;
    color: #0B7D71;
    text-align: center;
    font-size: 40px;
    margin-bottom: 0;
    margin-top: 40px;
}


.ingo1, .ingo2 {
    display: flex;
    justify-content: center;
    column-gap: 20px;
    align-items: center;
    margin: 0 7%;
}

.ingo1 img, .ingo2 img {
  width: 40%;
  height: auto;
}

.info1_text, .info2_text {
  width: 45%;
}

h2 {
  font-size: 1.3rem;
  color: #666;
  margin-bottom: 10px;
}

h1 {
  font-size: 2rem;
  color: #333;
  margin-bottom: 20px;
}

p {
  font-size: 1rem;
  color: #666;
  max-width: 80%;
}

.ingo1 {
  flex-direction: row;
}

.ingo2 {
  flex-direction: row-reverse;
  margin-top: -5%;
}

.join {
  background-color: #76B9B2;
  display: flex;
  flex-direction: column;
  align-items: center; /* Горизонтальное выравнивание */
  justify-content: center; /* Вертикальное выравнивание */
  text-align: center; /* Центрируем текст */
  padding: 60px 20px; /* Отступы сверху и снизу */
}

.join img {
  max-width: 100%; /* Сделаем изображение адаптивным */
  height: auto; /* Поддерживаем пропорции */
  margin-bottom: 20px; /* Отступ от изображения */
}

.join h1 {
  color: white;
  font-size: 2rem; /* Размер шрифта заголовка */
  margin-bottom: 20px; /* Отступ снизу */
}

p {
  color: #205A54;
  font-size: 1.1rem; /* Размер шрифта для текста */
  margin-bottom: 30px; /* Отступ снизу */
}

button {
  background-color: #E38D23;
  color: white;
  font-size: 24px;
  padding: 15px 40px; /* Внутренние отступы кнопки */
  border-radius: 50px; /* Круглые края */
  border: none; /* Убираем стандартный бордер */
  cursor: pointer;
  transition: background-color 0.3s ease; /* Плавное изменение цвета при наведении */
}

button:hover {
  background-color: #d97c1b; /* Изменение цвета кнопки при наведении */
}

.ppp {
  margin-left: 200px;
}

/* Мобильные устройства (ширина экрана до 767px) */
@media (max-width: 767px) {
  .girl {
    flex-direction: column;
    padding: 20px;
  }

  .girl img {
    width: 80%;
    margin-bottom: 20px;
  }

  .girl h1 {
    font-size: 40px;
    text-align: center;
    margin: 0 auto;
  }

  .flag {
    padding: 20px 0;
  }

  .column-flag {
    flex-direction: column;
    align-items: center;
    column-gap: 5%;
  }

  .flag-item {
    margin-bottom: 15px;
  }

  .flag-img {
    width: 80px;
    height: 50px;
  }

  .info h4 {
    font-size: 30px;
    margin-top: 20px;
  }

  .ingo1, .ingo2 {
    flex-direction: column;
    align-items: center;
    margin: 0 10%;
  }

  .ingo1 img, .ingo2 img {
    width: 80%;
    height: auto;
  }

  .info1_text, .info2_text {
    width: 100%;
    text-align: center;
  }

  h1, h2, p {
    font-size: 1.1rem;
    margin: 5px auto;
  }

  .join {
    padding: 40px 20px;
  }

  .join h1 {
    font-size: 1.5rem;
  }

  .flag p{
    margin: 0 auto;
  }

  button {
    font-size: 18px;
    padding: 12px 30px;
  }

  .ppp {
    margin-left: 0;
  }
}

/* Планшеты (ширина экрана от 768px до 1024px) */
@media (min-width: 768px) and (max-width: 1024px) {
  .girl {
    flex-direction: row;
    padding: 40px;
  }

  .girl img {
    width: 50%;
  }

  .girl h1 {
    font-size: 50px;
    margin-top: 10%;
    text-align: right;
    margin-right: 6%;
  }

  .flag {
    padding: 30px 0;
  }

  .column-flag {
    flex-direction: row;
    justify-content: center;
    column-gap: 15%;
  }

  .flag-item {
    margin-bottom: 20px;
  }

  .flag-img {
    width: 90px;
    height: 55px;
  }

  .flag p{
    margin: 0 auto;
  }

  .info h4 {
    font-size: 35px;
    margin-top: 30px;
  }

  .ingo1, .ingo2 {
    margin: 0 5%;
  }

  .ingo1 img, .ingo2 img {
    width: 60%;
    height: auto;
  }

  .info1_text, .info2_text {
    width: 45%;
    text-align: left;
  }

  h1, h2, p {
    font-size: 1.2rem;

  }

  .join {
    padding: 50px 20px;
  }

  .join h1 {
    font-size: 1.8rem;
  }

  button {
    font-size: 20px;
    padding: 14px 35px;
  }

  .ppp {
    margin-left: 150px;
  }
}


  </style>
