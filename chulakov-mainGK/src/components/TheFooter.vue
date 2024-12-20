<template>
<footer class="footer">
    <div class="footer-column">
      <h3>{{ $t('studyLanguages') }}</h3>
      <ul>
        <li>{{ $t('studyEnglishOnline') }}</li>
        <li>{{ $t('studyRussianOnline') }}</li>
        <li>{{ $t('studyFrenchOnline') }}</li>
        <li>{{ $t('studyItalianOnline') }}</li>
      </ul>
    </div>

    <div class="footer-column">
      <h3>{{ $t('discoverLingua') }}</h3>
      <ul>
        <li>{{ $t('premiumSubscription') }}</li>
      </ul>
      <h3>{{ $t('infoFromLingua') }}</h3>
      <ul>
        <li>{{ $t('aboutCompany') }}</li>
        <li>{{ $t('howLinguaWorks') }}</li>
      </ul>
    </div>

    <div class="footer-column">
      <h3>{{ $t('helpForUsers') }}</h3>
      <ul>
        <li>{{ $t('contactUs') }}</li>
      </ul>
      <h3>{{ $t('partnerships') }}</h3>
      <ul>
        <li>{{ $t('ithub') }}</li>
        <li>{{ $t('chulacovStudio') }}</li>
      </ul>
    </div>

  </footer>
  </template>

  <script>
 export default {
  data() {
    return {
      isLanguageMenuOpen: false,
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
  .footer {
    display: flex;
    background-color: #FFEFD9;
    padding: 35px;
    color: #205a54;
    font-family: Arial, sans-serif;
    margin-left: 6%;
  }

  .footer-column {
    flex: 1;
    padding: 0 15px;
  }

  .footer-column h3 {
    font-size: 18px;
    font-weight: bold;
    margin-bottom: 10px;
  }

  .footer-column ul {
    list-style: none;
    padding: 0;
    margin: 0;
  }

  .footer-column ul li {
    margin-bottom: 8px;
    font-size: 14px;
    cursor: pointer;

  }

  .footer-column ul li:hover {
    text-decoration: underline;
  }

  /* Мобильные устройства (ширина экрана до 767px) */
@media (max-width: 767px) {
  .footer {
    flex-direction: column;
    padding: 20px 10px;
    margin-left: 0;
  }

  .footer-column {
    flex: none;
    padding: 10px 0;
    text-align: center;
  }

  .footer-column h3 {
    font-size: 16px;
    margin-bottom: 8px;
  }

  .footer-column ul li {
    font-size: 12px;
    margin-bottom: 6px;
  }
}

/* Планшеты (ширина экрана от 768px до 1024px) */
@media (min-width: 768px) and (max-width: 1024px) {
  .footer {
    flex-direction: row;
    padding: 25px;
    margin-left: 0;
  }

  .footer-column {
    flex: 1;
    padding: 0 10px;
    text-align: center;
  }

  .footer-column h3 {
    font-size: 16px;
    margin-bottom: 12px;
  }

  .footer-column ul li {
    font-size: 13px;
    margin-bottom: 6px;
  }
}

  </style>
