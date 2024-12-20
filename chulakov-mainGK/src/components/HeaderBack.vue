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


  </header>
</template>

<script>


export default {

  data() {
    return {

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
  color: #FFEFD9;
  background: transparent;
  border: none;
  cursor: pointer;
  white-space: nowrap;
}

.profile-link button:hover {
  text-decoration: underline;
}
</style>
