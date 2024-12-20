<template>

    <section class="unit">
        <h1>УРОК С ПРЕПОДАВАТЕЛЕМ</h1>
        <div class="code">
            <input type="code" id="code" v-model="email" required placeholder="Введите уникальный ключ" />
            <input type="code" id="code" v-model="email" required placeholder="Введите номер урока" />
            <router-link><button class="code_btn">НАЙТИ</button></router-link>
        </div>
    </section>

    <section class="info_unit">
        <div>cdsvgfbfvdsc</div>
        <img src="/public/chulacov_person2.png" alt="Девушка с планшетом" class="intro-img" />
    </section>
</template>

<style>
.unit h1{
    color: #B75807;
    text-align: center;
}

.code input{
    padding: 18px;
    margin-top: 5px;
    font-size: 17px;
    border: 1px solid #205A54;
    border-radius: 40px;
    padding-right: 30px;
}

.code{
    display: flex;
    justify-content: center;
    column-gap: 10%;
    align-items: center;
}

.code_btn{
    background-color: #76B9B2;
    padding: 18px 60px;
}

.info_unit{
    display: flex;
    justify-content: space-around;
    margin: 10px 5%;
}

.info_unit img{
    width: 60%;
}
</style>
