<template>
  <div class="teacher-profile">

    <TheHeader/>
    <main>
      <section class="profile-section">
        <div class="profile-content">
          <div class="profile-image-container">
            <img
              loading="lazy"
              src="https://cdn.builder.io/api/v1/image/assets/TEMP/dbfabad71e64e8b3bbcdc7a92bef4b4b86a689feb360b271d63061ee8ab7835e?placeholderIfAbsent=true&apiKey=9cc457d3ae444a0cbe54d30aad64c049"
              class="profile-image"
              alt="Teacher profile photo"
            />
          </div>
          <div class="profile-details">
            <div class="details-group">
              <div class="detail-row">
                <div class="detail-label">Имя:</div>
                <div class="detail-value">Тимофеев Данил</div>
              </div>
              <div class="detail-row">
                <div class="detail-label">Пол:</div>
                <div class="detail-value">Мужской</div>
              </div>
            </div>
            <div class="detail-row">
              <div class="detail-label">Дата рождения:</div>
              <div class="detail-value">25.05.2005</div>
            </div>
          </div>
        </div>
      </section>

      <section class="experience-section">
        <div class="experience-content">
          <div class="experience-group">
            <div class="experience-row">
              <div class="experience-label">Опыт работы:</div>
              <div class="experience-value">
                - Педагогический стаж — 8 лет. <br />- Преподавание в средней
                школе с 2015 года по настоящее время. <br />- Преподавание
                разговорного английского в языковых курсах с 2016 года.
              </div>
            </div>
          </div>
          <div class="specialization-row">
            <div class="specialization-label">Специализация:</div>
            <div class="specialization-value">
              Учитель английского языка (Средний B1-B2)
            </div>
          </div>
          <div class="interests-group">
            <div class="interests-row">
              <div class="interests-label">Интересы в преподавании:</div>
              <div class="interests-value">
                - Подготовка учеников к международным экзаменам (IELTS, TOEFL)
                <br />- Развитие навыков аудирования и говорения <br />-
                Изучение английской культуры и литературы
              </div>
            </div>
          </div>
        </div>
        <div class="additional-content">
          <div class="courses-row">
            <div class="courses-label">Дополнительные курсы:</div>
            <div class="courses-value">
              - Сертификат TESOL <br />- Курсы по интерактивному обучению
            </div>
          </div>
          <div class="education-row">
            <div class="education-label">Место обучения:</div>
            <div class="education-value">
              Заканчивал обучение в Московском государственном университете
              (МГУ) по специальности "Филология", а также прошел курсы повышения
              квалификации в British Council.
            </div>
          </div>
        </div>
      </section>
    </main>
    <TheFooter/>


  </div>
</template>

<script>
import TheHeader from '../components/TheHeader.vue';
import TheFooter from '../components/TheFooter.vue';


export default {
  components: {
    TheHeader,
    TheFooter,
  },
};
</script>

<style scoped>
.teacher-profile {
  background: rgba(255, 239, 217, 1);
  display: flex;
  flex-direction: column;
  overflow: hidden;
  align-items: center;
  padding: 18px 0 0;
}

.header-content {
  width: 100%;
  max-width: 1360px;
  display: flex;
  gap: 20px;
}

.language-section {
  display: flex;
  gap: 27px;
  color: rgba(32, 90, 84, 1);
  text-align: center;
  margin: auto 0;
  font: 400 30px Roboto, sans-serif;
}

.language-icon {
  aspect-ratio: 1;
  object-fit: contain;
  object-position: center;
  width: 54px;
  border-radius: 50%;
}

.main-header {
  display: flex;
  width: 77%;
  gap: 20px;
}

.logo {
  display: flex;
  align-items: center;
  gap: 9px;
  color: rgba(32, 90, 84, 1);
  text-align: center;
  font: 400 32px Seymour One, sans-serif;
}

.logo-image {
  aspect-ratio: 0.98;
  object-fit: contain;
  width: 126px;
}

.account-text {
  color: rgba(32, 90, 84, 1);
  text-align: center;
  font: 400 30px Roboto, sans-serif;
}

.profile-section {
  border-radius: 25px;
  background: rgba(248, 230, 204, 1);
  box-shadow: 0 4px 4px rgba(0, 0, 0, 0.2);
  margin: 27px 0 0;
  width: 100%;
  max-width: 1387px;
  padding: 17px 52px 35px;
}

.profile-content {
  display: flex;
  gap: 20px;
}

.profile-image {
  aspect-ratio: 0.99;
  object-fit: contain;
  width: 50%;
  box-shadow: 0 4px 4px rgba(0, 0, 0, 0.2);
  border-radius: 50%;
}

.profile-details {
  display: flex;
  margin-top: 50px;
  flex-direction: column;
}

.detail-row {
  display: flex;
  gap: 30px;
  margin-top: 32px;
}

.detail-label {
  color: rgba(32, 90, 84, 1);
  text-align: left;
  font: 500 36px Roboto, sans-serif;
  margin-top: 10px;
}

.detail-value {
  border-radius: 25px;
  background: rgba(255, 239, 217, 1);
  box-shadow: 0 4px 4px rgba(0, 0, 0, 0.25);
  color: rgba(99, 99, 99, 1);
  text-align: center;
  padding: 18px 64px;
  font: 400 24px Poppins, sans-serif;
  margin-right: 150px;
}

.experience-section {
  border-radius: 25px;
  background: rgba(248, 230, 204, 1);
  box-shadow: 0 4px 4px rgba(0, 0, 0, 0.2);
  margin: 40px 0 0;
  width: 100%;
  max-width: 1387px;
  padding: 47px 0;
}

.experience-content,
.additional-content {
  margin: 0 42px;
}

.experience-row,
.specialization-row,
.interests-row,
.courses-row,
.education-row {
  display: flex;
  gap: 20px;
  margin: 27px 0;
}

.experience-label,
.specialization-label,
.interests-label,
.courses-label,
.education-label {
  color: rgba(32, 90, 84, 1);
  text-align: right;
  font: 500 36px Roboto, sans-serif;
  width: 218px;
  margin-right: 150px;

}

.experience-value,
.specialization-value,
.interests-value,
.courses-value,
.education-value {
  border-radius: 25px;
  background: rgba(255, 239, 217, 1);
  box-shadow: 0 4px 4px rgba(0, 0, 0, 0.25);
  color: rgba(99, 99, 99, 1);
  padding: 16px 28px;
  font: 400 20px Poppins, sans-serif;
  flex: 1;
}

.footer {
  margin: 56px 0 0;
  width: 100%;
  max-width: 1029px;
}

.footer-content {
  display: flex;
  gap: 20px;
}

.footer-column {
  flex: 1;
}

.footer-heading {
  color: #000;
  font: 900 21px Roboto, sans-serif;
}

.footer-text {
  font: 300 19px/38px Roboto, sans-serif;
  margin: 16px 0 0;
}

.premium-text {
  font: 300 19px/38px Roboto, sans-serif;
  margin: 16px 0 0;
}

.premium-highlight {
  text-decoration: underline;
  font-variant: small-caps;
  text-transform: uppercase;
}

.footer-link {
  font: 300 19px/38px Roboto, sans-serif;
  margin: 5px 0;
}

@media (max-width: 991px) {
  .header-content,
  .profile-content,
  .experience-content,
  .footer-content {
    flex-direction: column;
    gap: 40px;
  }

  .main-header {
    width: 100%;
  }

  .profile-section,
  .experience-section {
    padding: 20px;
  }

  .profile-details {
    margin-top: 40px;
  }

  .detail-value,
  .experience-value,
  .specialization-value,
  .interests-value,
  .courses-value,
  .education-value {
    padding: 18px 20px;
  }

  .experience-label,
  .specialization-label,
  .interests-label,
  .courses-label,
  .education-label {
    width: auto;
  }

  .footer {
    margin-top: 40px;
  }
}
</style>
