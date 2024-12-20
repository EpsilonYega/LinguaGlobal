<template>
  <main class="learning-dashboard">


    <section class="learning-progress">
      <div class="current-language">
        <div class="language-status">
          <h1 class="language-title">Вы изучаете: АНГЛИЙСКИЙ</h1>
          <div class="level-indicator">
            <span class="level-text">А1 - начальный</span>
            <img
              src="https://cdn.builder.io/api/v1/image/assets/TEMP/df7d02e1e9854fa77adc44f6f2ade1e59cb0d256bb1830ad890e079f317faa2c?placeholderIfAbsent=true&apiKey=9cc457d3ae444a0cbe54d30aad64c049"
              alt="Level indicator icon"
              class="level-icon"
            />
          </div>
          <div class="progress-chart"></div>
        </div>
      </div>

      <aside class="progress-stats">
        <div class="lesson-progress">
          <div class="progress-circle">
            <div class="circle-content">
              <img
                src="https://cdn.builder.io/api/v1/image/assets/TEMP/039955c057324d5598b8a46f4d0212bd06e03d11ef2335c367d31c5e556419ca?placeholderIfAbsent=true&apiKey=9cc457d3ae444a0cbe54d30aad64c049"
                alt="Progress indicator"
                class="progress-icon"
              />
              <div class="progress-numbers">
                <span>Выполнено</span>
                <span class="lesson-count">2/8</span>
                <span class="lesson-label">уроков</span>
              </div>
            </div>
          </div>
          <p class="progress-message">Выполни все 8 уроков и получи награду</p>
        </div>

        <div class="vocabulary-progress">
          <div class="word-count">
            <img
              src="https://cdn.builder.io/api/v1/image/assets/TEMP/5d6e2304afc5ba396ed6586559214901a73538f04ec3d54ae7b6db3a823eea0a?placeholderIfAbsent=true&apiKey=9cc457d3ae444a0cbe54d30aad64c049"
              alt="Vocabulary icon"
              class="vocab-icon"
            />
            <span class="word-number">27</span>
          </div>
          <p class="vocab-message">слов ты выучил на данный момент</p>
        </div>

        <div class="additional-stats"></div>
      </aside>
    </section>

    <section class="teacher-lesson">
      <h2 class="section-title">УРОК С ПРЕПОДАВАТЕЛЕМ</h2>

      <form class="lesson-form">
        <label for="uniqueKey" class="visually-hidden">Уникальный ключ</label>
        <input
          type="text"
          id="uniqueKey"
          class="form-input"
          placeholder="Введите уникальный ключ"
        />

        <label for="lessonNumber" class="visually-hidden">Номер урока</label>
        <input
          type="text"
          id="lessonNumber"
          class="form-input"
          placeholder="Введите номер урока"
        />

        <button type="submit" class="start-lesson-btn">начать урок</button>
      </form>

      <div class="instruction-container">
        <div class="instruction-content">
          <h3 class="instruction-title">Как записаться на урок с преподавателем?</h3>

          <div class="instruction-step">
            <img
              src="https://cdn.builder.io/api/v1/image/assets/TEMP/e713b589dadfe7cdb8c585edbec7c810350a57d4e77b8981a6a7e083bfa7cda7?placeholderIfAbsent=true&apiKey=9cc457d3ae444a0cbe54d30aad64c049"
              alt="Step 1 icon"
              class="step-icon"
            />
            <span class="step-text">Перейдите в личный кабинет</span>
          </div>

          <div class="instruction-step">
            <img
              src="https://cdn.builder.io/api/v1/image/assets/TEMP/e713b589dadfe7cdb8c585edbec7c810350a57d4e77b8981a6a7e083bfa7cda7?placeholderIfAbsent=true&apiKey=9cc457d3ae444a0cbe54d30aad64c049"
              alt="Step 2 icon"
              class="step-icon"
            />
            <span class="step-text">Нажмите "<span class="highlight">Выбрать преподавателя</span>"</span>
          </div>

          <div class="instruction-step">
            <img
              src="https://cdn.builder.io/api/v1/image/assets/TEMP/e713b589dadfe7cdb8c585edbec7c810350a57d4e77b8981a6a7e083bfa7cda7?placeholderIfAbsent=true&apiKey=9cc457d3ae444a0cbe54d30aad64c049"
              alt="Step 3 icon"
              class="step-icon"
            />
            <span class="step-text">Укажите свой уровень знаний</span>
          </div>

          <div class="instruction-step">
            <img
              src="https://cdn.builder.io/api/v1/image/assets/TEMP/e713b589dadfe7cdb8c585edbec7c810350a57d4e77b8981a6a7e083bfa7cda7?placeholderIfAbsent=true&apiKey=9cc457d3ae444a0cbe54d30aad64c049"
              alt="Step 4 icon"
              class="step-icon"
            />
            <span class="step-text">Скорректируйте дату и время урока</span>
          </div>

          <div class="instruction-step">
            <img
              src="https://cdn.builder.io/api/v1/image/assets/TEMP/e713b589dadfe7cdb8c585edbec7c810350a57d4e77b8981a6a7e083bfa7cda7?placeholderIfAbsent=true&apiKey=9cc457d3ae444a0cbe54d30aad64c049"
              alt="Step 5 icon"
              class="step-icon"
            />
            <span class="step-text">Подключитесь вовремя на занятие</span>
          </div>
        </div>

        <div class="instruction-image">
          <img
            src="https://cdn.builder.io/api/v1/image/assets/TEMP/52256d5248220e86c2dd5ff620747d9327f3c0b4f7f82cced80b4348cf88b1df?placeholderIfAbsent=true&apiKey=9cc457d3ae444a0cbe54d30aad64c049"
            alt="Teacher instruction illustration"
            class="teacher-illustration"
          />
        </div>
      </div>
    </section>


  </main>
</template>

<style scoped>
.visually-hidden {
  position: absolute;
  width: 1px;
  height: 1px;
  padding: 0;
  margin: -1px;
  overflow: hidden;
  clip: rect(0,0,0,0);
  border: 0;
}

.learning-dashboard {
  background-color: rgba(255, 239, 217, 1);
  display: flex;
  flex-direction: column;
  overflow: hidden;
  padding: 18px 0 554px;
}

.top-header {
  display: flex;
  width: 100%;
  padding-left: 27px;
  flex-direction: column;
  align-items: center;
}

.language-nav {
  width: 100%;
  max-width: 1360px;
}

.language-selector {
  display: flex;
  gap: 27px;
  align-items: center;
  color: rgba(32, 90, 84, 1);
  font: 400 30px Roboto, sans-serif;
}

.language-icon {
  width: 54px;
  height: 54px;
  border-radius: 50%;
  object-fit: contain;
}

.brand-section {
  width: 100%;
  max-width: 1360px;
  display: flex;
  justify-content: space-between;
  align-items: center;
}

.brand-logo {
  display: flex;
  align-items: center;
  gap: 9px;
  color: rgba(32, 90, 84, 1);
  font: 400 32px 'Seymour One', sans-serif;
}

.brand-image {
  width: 126px;
  object-fit: contain;
}

.account-btn {
  color: rgba(32, 90, 84, 1);
  font: 400 30px Roboto, sans-serif;
  background: none;
  border: none;
  cursor: pointer;
}

.learning-progress {
  margin-top: 111px;
  display: flex;
  gap: 20px;
}

.current-language {
  flex: 0.68;
}

.language-title {
  color: rgba(227, 141, 35, 1);
  font: 400 31px Roboto, sans-serif;
}

.level-indicator {
  border-radius: 35px;
  background-color: rgba(236, 213, 181, 1);
  display: flex;
  margin-top: 24px;
  width: 400px;
  gap: 20px;
  justify-content: space-between;
  padding: 19px 28px;
  color: rgba(11, 125, 113, 1);
  font: 400 24px Roboto, sans-serif;
}

.progress-stats {
  flex: 0.32;
}

.lesson-progress,
.vocabulary-progress {
  border-radius: 40px;
  background-color: rgba(248, 230, 204, 1);
  padding: 17px 57px 48px;
  margin-bottom: 38px;
}

.progress-circle {
  border: 23px solid rgba(121, 191, 173, 1);
  border-radius: 50%;
}

.circle-content {
  background-color: rgba(248, 230, 204, 1);
  border-radius: 50%;
  padding: 33px 42px;
  text-align: center;
  color: rgba(32, 90, 84, 1);
  font: 800 18px Roboto, sans-serif;
}

.lesson-count {
  display: block;
  color: rgba(0, 0, 0, 1);
  font-size: 68px;
  font-weight: 200;
  margin: 28px 0;
}

.progress-message,
.vocab-message {
  color: rgba(183, 88, 7, 1);
  font: 400 20px Roboto, sans-serif;
  text-align: center;
  margin-top: 38px;
}

.word-count {
  display: flex;
  gap: 36px;
  align-items: center;
  font: 400 91px Roboto, sans-serif;
}

.vocab-icon {
  width: 100px;
  object-fit: contain;
}

.teacher-lesson {
  margin-top: 29px;
  text-align: center;
}

.section-title {
  color: rgba(183, 88, 7, 1);
  font: 900 33px Roboto, sans-serif;
}

.lesson-form {
  display: flex;
  justify-content: space-between;
  margin-top: 41px;
  gap: 20px;
}

.form-input {
  border-radius: 43px;
  background-color: rgba(255, 255, 255, 1);
  padding: 31px 34px;
  border: 2px solid rgba(32, 90, 84, 1);
  color: rgba(0, 0, 0, 0.44);
  font: 300 25px Roboto, sans-serif;
}

.start-lesson-btn {
  border-radius: 43px;
  background-color: rgba(118, 185, 178, 1);
  color: rgba(255, 255, 255, 1);
  font: 800 25px Roboto, sans-serif;
  padding: 34px 70px;
  border: none;
  cursor: pointer;
}

.instruction-container {
  display: flex;
  margin-top: 76px;
  gap: 20px;
}

.instruction-content {
  flex: 0.55;
  background-color: rgba(255, 255, 255, 1);
  border-radius: 45px;
  padding: 37px 33px;
}

.instruction-title {
  color: rgba(227, 141, 35, 1);
  font: 800 27px Roboto, sans-serif;
  text-align: right;
}

.instruction-step {
  display: flex;
  gap: 7px;
  margin-top: 50px;
  font: 300 25px Roboto, sans-serif;
}

.step-icon {
  width: 73px;
  object-fit: contain;
}

.highlight {
  text-decoration: underline;
  color: rgba(183, 88, 7, 1);
}

.teacher-illustration {

  object-fit: contain;
}

.site-footer {
  margin-top: 109px;
  display: flex;
  justify-content: space-between;
  max-width: 1029px;
  margin-left: auto;
  margin-right: auto;
}

.footer-section {
  flex: 0.33;
}

.footer-title {
  color: rgba(0, 0, 0, 1);
  font: 900 21px Roboto, sans-serif;
}

.footer-text {
  color: rgba(0, 0, 0, 1);
  font: 300 19px/38px Roboto, sans-serif;
  margin-top: 16px;
}

.premium-text {
  text-decoration: underline;
  font-variant: small-caps;
  text-transform: uppercase;
}

@media (max-width: 991px) {
  .learning-dashboard {
    padding-bottom: 100px;
  }

  .top-header {
    max-width: 100%;
    padding-left: 20px;
  }

  .language-nav,
  .brand-section,
  .learning-progress,
  .lesson-form,
  .instruction-container {
    flex-direction: column;
  }

  .language-selector,
  .brand-logo,
  .account-btn {
    margin-top: 40px;
  }

  .level-indicator {
    max-width: 100%;
    padding: 20px;
  }

  .lesson-count {
    font-size: 40px;
  }

  .word-count {
    font-size: 40px;
  }

  .form-input,
  .start-lesson-btn {
    width: 100%;
    padding: 20px;
  }

  .instruction-content,
  .teacher-illustration {
    max-width: 100%;
  }

  .site-footer {
    flex-direction: column;
    gap: 40px;
  }
}
</style>
