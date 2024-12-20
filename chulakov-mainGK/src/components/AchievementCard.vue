<template>
  <div class="achievement-card">
    <div class="achievement-content">
      <img
        :src="imageSrc"
        :alt="description"
        class="achievement-icon"
        loading="lazy"
      />
      <p class="achievement-description">{{ description }}</p>
    </div>
    <h3 class="achievement-title">{{ title }}</h3>
  </div>
</template>

<script lang="ts">
import { defineComponent } from 'vue';

export default defineComponent({
  name: 'AchievementCard',
  props: {
    imageSrc: {
      type: String,
      required: true
    },
    title: {
      type: String,
      required: true
    },
    description: {
      type: String,
      required: true
    }
  }
});
</script>

<style scoped>
.achievement-card {
  background-color: rgba(255, 244, 227, 1);
  box-shadow: 0px 4px 4px rgba(0, 0, 0, 0.25);
  border: 4px solid rgba(227, 141, 35, 1);
  padding-top: 14px;
}

.achievement-content {
  display: flex;
  gap: 22px;
  padding: 0 10px;
  align-items: center;
}

.achievement-icon {
  width: 108px;
  aspect-ratio: 0.96;
  object-fit: contain;
}

.achievement-description {
  color: rgba(99, 99, 99, 1);
  font: 400 20px Poppins, sans-serif;
}

.achievement-title {
  background-color: rgba(236, 213, 181, 1);
  color: rgba(32, 90, 84, 1);
  font: 400 24px Poppins, sans-serif;
  padding: 19px 67px;
  margin-top: 19px;
  text-align: center;
}

@media (max-width: 991px) {
  .achievement-title {
    padding: 19px 20px;
  }
}
</style>
