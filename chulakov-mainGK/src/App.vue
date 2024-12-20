<template>
  <div class="page-container">


    <main class="content">
      <RouterView />
    </main>


  </div>
</template>



<style>
html,
body {
  height: 100%;
  margin: 0;
  background-color: #FFEFD9;

}

.page-container {
  display: flex;
  flex-direction: column;
  min-height: 100vh;
}

.content {
  flex-grow: 1;
}
</style>
