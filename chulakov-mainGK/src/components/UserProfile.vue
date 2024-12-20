<template class="ggg">
  <TheHeader/>

  <form class="profile-container">
    <section class="header-section">

      <div class="avatar-wrapper">
        <div class="main-avatar">
          <img
            loading="lazy"
            src="https://cdn.builder.io/api/v1/image/assets/TEMP/007d7787ab894f62c11a1e122f738eed035d3bda0852a861c023e6a85302857b?placeholderIfAbsent=true&apiKey=9cc457d3ae444a0cbe54d30aad64c049"
            class="avatar-bg"
            alt=""
          />
        </div>
        <button type="button" class="edit-button">Изменить фото</button>
      </div>

    </section>

    <section class="personal-info">
      <div class="info-wrapper">
        <div class="name-group">
          <div class="input-group">
            <label for="firstName" class="field-label">Имя:</label>
            <input type="text" id="firstName" class="text-input" v-model="firstName" placeholder="Имя" />
          </div>
          <div class="input-group">
            <label for="lastName" class="field-label">Фамилия:</label>
            <input type="text" id="lastName" class="text-input" v-model="lastName" placeholder="Фамилия" />
          </div>
        </div>
        <div class="gender-group">
          <label for="gender" class="field-label">Пол:</label>
          <select id="gender" class="select-input" v-model="sex">
            <option value="male">Мужской</option>
            <option value="female">Женский</option>
          </select>
        </div>
        <div class="birthdate-group">
          <label class="field-label">Дата рождения:</label>
          <div class="date-inputs">
            <input type="number" class="date-input" placeholder="День" aria-label="День" v-model="day"/>
            <select id="month" class="date-input" v-model="month">
            <option value="">Выберите месяц</option>
            <option value="01">Январь</option>
            <option value="02">Февраль</option>
            <option value="03">Март</option>
            <option value="04">Апрель</option>
            <option value="05">Май</option>
            <option value="06">Июнь</option>
            <option value="07">Июль</option>
            <option value="08">Август</option>
            <option value="09">Сентябрь</option>
            <option value="10">Октябрь</option>
            <option value="11">Ноябрь</option>
            <option value="12">Декабрь</option>
          </select>
            <input type="number" class="date-input" placeholder="Год" aria-label="Год" v-model="year"/>
          </div>
        </div>
      </div>
    </section>

    <section class="additional-info">
      <div class="bio-group">
        <label for="bio" class="field-label">Краткая информация:</label>
        <textarea id="bio" class="textarea-input" placeholder="Расскажи о себе" v-model="info"></textarea>
      </div>

      <div class="language-group">
        <label for="languages" class="field-label">Выбор языков:</label>
        <select id="languages" class="select-input" v-model="language">
          <option value="">Не выбрано</option>
          <option value="russian">Русской</option>
          <option value="english">Английский</option>
          <option value="french">Французкий</option>
          <option value="italian">Итальянский</option>
        </select>
      </div>

      <div class="contact-group">
        <div class="input-group">
          <label for="phone" class="field-label">Номер телефона:</label>
          <input type="tel" id="phone" class="text-input" placeholder="Укажите номер телефона" v-model="phoneNumber"/>
        </div>

        <div class="input-group">
          <label for="email" class="field-label">Почта:</label>
          <input type="email" id="email" class="text-input" placeholder="Укажите электронную почту" v-model="email"/>
        </div>
      </div>

      <button type="submit" class="submit-button" @click="updateUser">Сохранить</button>
    </section>

    <footer class="profile-footer"></footer>
  </form>
  <TheFooter/>
</template>

<script>
import TheHeader from './TheHeader.vue';
import TheFooter from './TheFooter.vue';
import api from '../api.js';

export default {
  components: {
    TheHeader,
    TheFooter,
  },
  data() {
    return {
      firstName: '',
      lastName: '',
      sex: '',
      day: '',
      month: '',
      year: '',
      info: '',
      language: '',
      phoneNumber: '',
      email: '',
      jwt: '',
    };
  },
  methods: {
    async updateUser() {
      event.preventDefault();
      const user = {
        username: this.firstName + " " + this.lastName,
        sex: this.sex,
        dateOfBirth: this.day + "/" + this.month + "/" + this.year,
        info: this.info,
        language: this.language,
        phoneNumber: this.phoneNumber,
        email: this.email
      };

      const jwt = this.$cookies.get('jwt');

      try {
        const response = await api.post("/main/user/update", null, {
          params: user,
          headers: {
            'Authorization': 'Bearer ' + jwt
          }
        });
        this.$router.push('/login');
      } catch (error) {
        console.log(error);
      }

    }
  },
};
</script>

<style scoped>
body {
  font-family: 'Roboto', sans-serif;
  background-color: #f4f4f4;
  margin: 0;
  padding: 20px;

}

.page_container
 {
  background-image: url(/public/chulacov_fon.png);
}

.profile-container {
  background-color: #ECD5B5;
  border-radius: 8px;
  box-shadow: 0 2px 10px rgba(0, 0, 0, 0.1);
  padding: 80px;
  max-width: 600px;
  margin: auto;

}

.header-section {
  display: flex;
  align-items: center;
  justify-content: center;
  margin-bottom: 20px;
  color: #205A54;
}

.avatar-wrapper {
  position: relative;

}

.main-avatar {
  position: relative;
}

.avatar-bg {
  width: 200px;
  height: 200px;
  border-radius: 50%;
  object-fit: cover;
}



.edit-avatar {
  position: absolute;
  bottom: -10px;
  right: -10px;
}

.edit-icon {
  width: 30px;
  height: 30px;
}

.personal-info, .additional-info {
  margin-bottom: 20px;
  color: #205A54;
}

.info-wrapper {
  display: flex;
  flex-direction: column;
  color: #205A54;
}

.input-group, .gender-group, .bio-group, .language-group, .contact-group {
  margin-bottom: 15px;
}

.field-label {
  margin-bottom: 5px;
  font-weight: bold;
}

.text-input, .select-input, .date-input, .textarea-input {
  width: calc(100% - 20px);
  padding: 10px;
  border: 1px solid #205A54;
  border-radius: 4px;
}

.date-inputs {
  display: flex;
  gap: 10px;
}

.date-input {
  flex: 1; /* Равномерное распределение пространства */
}

.textarea-input {
  height: 100px; /* Высота текстовой области */
}

.submit-button {
  background-color: #205A54; /* Цвет кнопки */
  color: white; /* Цвет текста на кнопке */
  padding: 10px;
  border: none;
  border-radius: 4px;
  cursor: pointer;
}

.submit-button:hover {
  background-color: #205A54; /* Цвет кнопки при наведении */
}

.profile-footer {
  text-align: center; /* Центрирование содержимого подвала */
}

.edit-button {
    margin-top: 10px; /* Отступ сверху для кнопки */
    padding: 8px 16px; /* Отступы внутри кнопки */
    border: none; /* Убираем границу */
    border-radius: 7px; /* Закругленные углы */
    background-color: #205A54; /* Цвет фона */
    color: white; /* Цвет текста */
    cursor: pointer; /* Курсор при наведении */

  }

  .edit-button:hover {
    background-color: #205A54; /* Цвет фона при наведении */
  }
</style>
