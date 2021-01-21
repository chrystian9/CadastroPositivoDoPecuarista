import Vue from 'vue'
import VueRouter from 'vue-router'
import Home from '../views/Home.vue'

Vue.use(VueRouter)

const routes = [
  {
    path: '/',
    name: 'Home',
    component: Home
  },
  {
    path: '/pecuarista',
    name: 'Pecuarista',
    component: () => import('../views/Pecuarista.vue')
  },
  {
    path: '/frigorifico',
    name: 'Frigorifico',
    component: () => import('../views/Frigorifico.vue')
  },
  {
    path: '/administrador',
    name: 'Administrador',
    component: () => import('../views/Administrador.vue')
  },
  {
    path: '/score',
    name: 'Pecuarista',
    component: () => import('../components/scoreComponent.vue')
  }
]
const router = new VueRouter({
  mode: 'history',
  base: process.env.BASE_URL,
  routes
})
export default router
