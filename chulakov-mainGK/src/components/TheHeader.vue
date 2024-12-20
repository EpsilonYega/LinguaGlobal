<template>
  <header class="header">
    <div class="language-selector">
      <button @click="toggleLanguageMenu" class="language-button">{{ $t('language') }}</button>
      <ul v-if="isLanguageMenuOpen" class="language-menu">
        <li @click="setLanguage('Русский')">Русский</li>
        <li @click="setLanguage('English')">English</li>
        <li @click="setLanguage('French')">French</li>
        <li @click="setLanguage('Italian')">Italian</li>
      </ul>
    </div>

    <div class="logo">
      <router-link to="/"><img src="/public/chulacov_logo.png" alt="Логотип сайта" class="logo_img"/></router-link>
    </div>

    <div class="profile-link">
      <button @click="openLoginModal">{{ $t('profile') }}</button>
    </div>

    <!-- Модальное окно -->
    <LogIn v-if="isLoginModalOpen" @close="closeLoginModal" />
  </header>
</template>

<script>
import LogIn from './LogIn.vue'; // Импортируем компонент LogIn

export default {
  components: {
    LogIn,
  },
  data() {
    return {
      isLanguageMenuOpen: false,
      isLoginModalOpen: false, // Состояние для открытия модального окна
    };
  },
  methods: {
    toggleLanguageMenu() {
      this.isLanguageMenuOpen = !this.isLanguageMenuOpen;
    },
    setLanguage(language) {
      this.$i18n.locale = language; // Меняем язык
      this.isLanguageMenuOpen = false;
    },
    openLoginModal() {
      this.isLoginModalOpen = true; // Открыть модальное окно
    },
    closeLoginModal() {
      this.isLoginModalOpen = false; // Закрыть модальное окно
    },
  },
};
</script>

<style scoped>
.header {
  display: flex;
  justify-content: center;
  column-gap: 30%;
  align-items: center;
  background-color: #FFEFD9;
  margin: 0 auto;
  white-space: nowrap;
}

.language-selector {
  position: relative;
}

.language-button {
  background-color: transparent;
  border: none;
  font-size: 18px;
  color: #205a54;
  cursor: pointer;
  white-space: nowrap;
}

.language-menu {
  position: absolute;
  top: 100%;
  left: 0;
  background: #fff;
  list-style: none;
  padding: 5px 0;
  margin: 0;
  box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);
  border: 1px solid #ddd;
  border-radius: 4px;
}

.language-menu li {
  padding: 5px 10px;
  cursor: pointer;
}

.language-menu li:hover {
  background-color: #f0f0f0;
}

.logo_img {
  height: 90px;
}

.profile-link button {
  font-size: 18px;
  color: #205a54;
  background: transparent;
  border: none;
  cursor: pointer;
  white-space: nowrap;
}

.profile-link button:hover {
  text-decoration: underline;
}

/* Мобильные устройства (ширина экрана до 767px) */
@media (max-width: 767px) {
  .header {
    flex-direction: column;
    justify-content: center;
    padding: 10px 0;
    row-gap: 15px;
  }

  .language-selector {
    position: static;
    text-align: center;
  }

  .language-button {
    font-size: 16px;
  }

  .language-menu {
    position: static;
    box-shadow: none;
    border: none;
    width: 100%;
    text-align: center;
  }

  .language-menu li {
    padding: 10px 0;
    border-top: 1px solid #ddd;
  }

  .language-menu li:hover {
    background-color: #f0f0f0;
  }

  .logo_img {
    height: 60px;
    margin-bottom: 10px;
  }

  .profile-link {
    text-align: center;
  }

  .profile-link button {
    font-size: 16px;
  }
}

/* Планшеты (ширина экрана от 768px до 1024px) */
@media (min-width: 768px) and (max-width: 1024px) {
  .header {
    justify-content: space-between;
    padding: 15px 20px;
  }

  .language-selector {
    position: relative;
    text-align: left;
  }

  .language-button {
    font-size: 18px;
  }

  .language-menu {
    position: absolute;
    top: 100%;
    left: 0;
    box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);
    border: 1px solid #ddd;
    border-radius: 4px;
  }

  .logo_img {
    height: 80px;
  }

  .profile-link button {
    font-size: 18px;
  }
}

</style>
