<template>
  <div class="video-chat">
    <TheHeader/>
    <main class="main-content">
      <section class="video-section">
        <div class="video-container">
          <img
            loading="lazy"
            src="https://cdn.builder.io/api/v1/image/assets/TEMP/4acd20178650c4776908d7c4b66d4170d05c1a6bc0c18ab8cf0ba2552a250e23?placeholderIfAbsent=true&apiKey=9cc457d3ae444a0cbe54d30aad64c049"
            alt="Main video feed"
            class="main-video"
          />
          <img
            loading="lazy"
            src="https://cdn.builder.io/api/v1/image/assets/TEMP/9a2626d482a2530f117a1eb07a737c304852ffdd5c3a68ad5c3f08d3042daacb?placeholderIfAbsent=true&apiKey=9cc457d3ae444a0cbe54d30aad64c049"
            alt="Secondary video feed"
            class="secondary-video"
          />
          <div class="video-controls">
            <button class="control-btn" aria-label="Mute audio">
              <img
                loading="lazy"
                src="https://cdn.builder.io/api/v1/image/assets/TEMP/628a2e28487625f678ace22535902208e4881ca47b93d6000e1b0da0a392b64e?placeholderIfAbsent=true&apiKey=9cc457d3ae444a0cbe54d30aad64c049"
                alt=""
                class="control-icon"
              />
            </button>
            <button class="control-btn" aria-label="Video settings">
              <img
                loading="lazy"
                src="https://cdn.builder.io/api/v1/image/assets/TEMP/7abb0c431affba44cb50d30fd21052bdad2bb8c9243849ac8d5d36fc369ca28b?placeholderIfAbsent=true&apiKey=9cc457d3ae444a0cbe54d30aad64c049"
                alt=""
                class="control-icon"
              />
            </button>
            <button class="control-btn" aria-label="End call">
              <img
                loading="lazy"
                src="https://cdn.builder.io/api/v1/image/assets/TEMP/78085b5fda038484ce8a44378aafddc154a5cc6b89b9f6f17019e05bf58b1982?placeholderIfAbsent=true&apiKey=9cc457d3ae444a0cbe54d30aad64c049"
                alt=""
                class="control-icon"
              />
            </button>
          </div>
        </div>
      </section>

      <aside class="chat-sidebar">
        <div class="chat-container">
          <h3 class="chat-header">ЧАТ</h3>

          <form class="message-form">
            <label for="messageInput" class="visually-hidden">Напишите сообщение</label>
            <input
              type="text"
              id="messageInput"
              class="message-input"
              placeholder="Напишите ваше сообщение"
            />
            <button type="submit" class="send-button" aria-label="Отправить сообщение">
              <img
                loading="lazy"
                src="https://cdn.builder.io/api/v1/image/assets/TEMP/3489cfd7c5a9be380f778bb2e6ce6d0514f5a205b4b5d5bf9c4ced79301c1021?placeholderIfAbsent=true&apiKey=9cc457d3ae444a0cbe54d30aad64c049"
                alt=""
                class="send-icon"
              />
            </button>
          </form>
        </div>
      </aside>

      <section class="lesson-info">
        <div class="teacher-info">
          <h3 class="topic-title">
            <span class="label">Тема:</span>
            <span class="topic">Present Continuous</span>
          </h3>
          <h3 class="info-title">
            <span class="label">Преподаватель: </span>Гусаров Дмитрий
            <br />
            <span class="label">Материалы урока:</span>
          </h3>
          <div class="materials">
            <div class="material-card">
              <img
                loading="lazy"
                src="https://cdn.builder.io/api/v1/image/assets/TEMP/d3560aee957e10fa24dd4f48f2d55eb5325040f64c38855e1d537bc04ae13842?placeholderIfAbsent=true&apiKey=9cc457d3ae444a0cbe54d30aad64c049"
                alt="Учебный материал 1"
                class="material-icon"
              />
            </div>
            <div class="material-card">
              <img
                loading="lazy"
                src="https://cdn.builder.io/api/v1/image/assets/TEMP/decf2fb819bae767f2d9b17edde867e8ae4da17cbe7baaed2e4a010d371cac19?placeholderIfAbsent=true&apiKey=9cc457d3ae444a0cbe54d30aad64c049"
                alt="Учебный материал 2"
                class="material-icon"
              />
            </div>
          </div>
        </div>
        <div class="lesson-topic">

        </div>
      </section>

      <div class="notes-info">
          <img
            loading="lazy"
            src="https://cdn.builder.io/api/v1/image/assets/TEMP/770c458834e2649678fbebe27497bcaeec5d58f3a379f3bbd50eb48d64cfab7d?placeholderIfAbsent=true&apiKey=9cc457d3ae444a0cbe54d30aad64c049"
            alt="Иллюстрация для заметок"
            class="notes-illustration"
          />
        </div>
      <section class="notes-section">
        <div class="notes-container">
          <h3 class="notes-title">Здесь вы можете записывать важную информацию во время урока</h3>
          <textarea
            class="notes-input"
            placeholder="Начать писать..."
            aria-label="Заметки урока"
          ></textarea>
        </div>

      </section>


    </main>
    <TheFooter/>
  </div>
</template>

<script lang="ts">

import TheHeader from './TheHeader.vue';
import TheFooter from './TheFooter.vue';

export default {
  components: {
    TheHeader,
    TheFooter,
  },
};


</script>




<style scoped>
.visually-hidden {
  position: absolute;
  width: 100px;
  height: 100px;
  padding: 0;
  margin: -1px;
  overflow: hidden;
  clip: rect(0, 0, 0, 0);
  border: 0;
}

.video-chat {
  display: flex;
  flex-direction: column;
  background-color: rgba(255, 239, 217, 1);
  padding: 18px 40px;
}



.language-selector {
  display: flex;
  align-items: center;
  gap: 27px;
  color: rgba(32, 90, 84, 1);
  font: 400 30px Roboto, sans-serif;
}

.language-icon {
  width: 54px;
  height: 54px;
  border-radius: 50%;
  object-fit: contain;
}

.logo {
  display: flex;
  align-items: center;
  gap: 9px;
  color: rgba(32, 90, 84, 1);
  font: 400 32px Seymour One, sans-serif;
}

.logo-image {
  width: 126px;
  object-fit: contain;
}

.main-content {
  display: flex;
  flex-wrap: wrap;
  gap: 20px;
}

.video-section {
  flex: 1;
  min-width: 300px;
}

.video-container {
  position: relative;
  border-radius: 38px;
  overflow: hidden;
}

.main-video {
  width: 100%;
  height: auto;
}

.secondary-video {
  position: absolute;
  top: 17px;
  right: 17px;
  width: 241px;
  border-radius: 38px;
}

.video-controls {
  position: absolute;
  bottom: 0;
  left: 0;
  right: 0;
  display: flex;
  justify-content: space-between;
  padding: 14px 30px;
  background-color: rgba(0, 0, 0, 0.7);
  border: 4px solid rgba(32, 90, 84, 1);
  border-top: none;
  border-radius: 0 0 38px 38px;
}

.control-btn {
  background: none;
  border: none;
  padding: 0;
  cursor: pointer;
}

.control-icon {
  width: 43px;
  height: 43px;
}

.chat-sidebar {
  width: 432px;
}

.cabinet-title {
  color: rgba(32, 90, 84, 1);
  font: 400 30px Roboto, sans-serif;
  text-align: center;
  margin-bottom: 93px;
}

.chat-container {
  background-color: white;
  border-radius: 38px;
  padding: 23px 18px;
}

.chat-header {
  color: rgba(227, 141, 35, 1);
  font: 500 22px Roboto, sans-serif;
  text-align: center;
  margin-bottom: 20px;
  height: 650px;
}

.chat-messages {
  margin-bottom: 22px;
}

.message {
  margin: 10px 0;
  font: 300 18px Roboto, sans-serif;
}

.sender {
  font-weight: 700;
}

.teacher-message .sender {
  color: rgba(32, 90, 84, 1);
}

.user-message .sender {
  color: rgba(183, 88, 7, 1);
}

.message-form {
  display: flex;
  gap: 20px;
  background-color: rgba(118, 185, 178, 0.31);
  border-radius: 38px;
  padding: 14px 27px;
}

.message-input {
  flex: 1;
  border: none;
  background: none;
  font: 300 13px Roboto, sans-serif;
  color: rgba(0, 0, 0, 0.5);
}

.message-input::placeholder {
  color: rgba(0, 0, 0, 0.5);
}

.send-button {
  background: none;
  border: none;
  padding: 0;
  cursor: pointer;
}

.send-icon {
  width: 26px;
  height: 26px;
}

.notes-input {
  width: 500px;
  height: 500px;

}

.notes-section {
  margin-top: -500px;
  margin-right: 60%;
  padding: 20px; /* Отступ внутри секции */
  border-radius: 8px; /* Скругление углов */
}

.notes-container {
  margin-bottom: 20px; /* Отступ снизу от контейнера с заметками */

}

.notes-info {
  text-align: right; /* Выравнивание изображения вправо */
}

.notes-illustration {
  width: 40%; /* Задайте нужную ширину изображения */
  margin-left: 100%;
}




/* Rest of the styles remain the same but follow the same pattern of semantic class names */

@media (max-width: 991px) {
  .video-chat {
    padding: 18px 20px;
  }

  .header {
    flex-direction: column;
    gap: 40px;
  }

  .main-content {
    flex-direction: column;
  }

  .chat-sidebar {
    width: 100%;
  }

  .video-controls {
    padding: 14px 20px;
  }

  /* Rest of the media queries follow the same pattern */
}
</style>
