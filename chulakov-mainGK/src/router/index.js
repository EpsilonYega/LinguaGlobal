import { createRouter, createWebHistory } from 'vue-router';

import Home from '../pages/HomePage.vue';
import RegisterForm from '@/components/RegisterForm.vue';
import LoginForm from '@/components/LogIn.vue';
import ProfilePage from '@/pages/ProfilePage.vue';
import ProfileStud from '@/components/ProfileStud.vue';
import AchievementCard from '@/components/AchievementCard.vue';
import VideoChat from '@/components/VideoChat.vue';
import LanguageLearning from '@/components/LanguageLearning.vue';
import UserProfile from '@/components/UserProfile.vue';
import TeacherProfile from '@/components/TeacherProfile.vue';
import StartTest from '@/test/StartTest.vue';
import Test2 from '@/test/Test2.vue';
import Test3 from '@/test/Test3.vue';
import Test4 from '@/test/Test4.vue';
import Test5 from '@/test/Test5.vue';
import Test6 from '@/test/Test6.vue';
import Test7 from '@/test/Test7.vue';
import Test8 from '@/test/Test8.vue';
import Test9 from '@/test/Test9.vue';
import Test10 from '@/test/Test10.vue';



const routes = [


{
 path: '/',component: Home,name: 'Home',
},
{
 path: '/login',name: 'login',component: LoginForm,
},
{
  path: '/register',name: 'register', component: RegisterForm,
},
{
  path: '/profile',component: ProfilePage,name: 'profile',
},

{
  path: '/studprof',component: ProfileStud,name: 'profilestud',
},
{
  path: '/profile',component: AchievementCard,name: 'profile',
},

{
  path: '/videochat',component: VideoChat,name: 'video',
},

{
  path: '/language',component: LanguageLearning,name: 'lang',
},

{
  path: '/userprofile',component: UserProfile,name: 'user',
},

{
  path: '/teacher',component: TeacherProfile,name: 'teach',
},

{
  path: '/start',component: StartTest,name: 'start',
},

{
  path: '/next',component: Test2,name: 'next',
},

{
  path: '/next2',component: Test3,name: 'next2',
},

{
  path: '/next3',component: Test4,name: 'next3',
},

{
  path: '/next4',component: Test5,name: 'next4',
},

{
  path: '/next5',component: Test6,name: 'next5',
},

{
  path: '/next6',component: Test7,name: 'next6',
},

{
  path: '/next7',component: Test8,name: 'next7',
},

{
  path: '/next8',component: Test9,name: 'next8',
},

{
  path: '/next9',component: Test10,name: 'next9',
},



];

const router = createRouter({
    history: createWebHistory(),
    routes,
});

export default router;
