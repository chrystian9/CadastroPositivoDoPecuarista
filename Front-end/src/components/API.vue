<template>
  <div>
    <div class="center">
      <h1 class="light">GetAPI</h1>
      <button class="btn center green" @click.prevent="getAPI()">GET API</button>
      <h2>{{ responseGetAPI }}</h2>
    </div>
    <div  class="center">
      <h1 class="light">PostAPI Cadastro</h1>
      <form>
        <div style="margin-left: 40%; width: 300px;" class="input-field">
            <input type="text" v-model="form.email"/>
            {{form.email}}
            <label for="email">Nome</label>
        </div>
        <div style="margin-left: 40%; width: 300px;" class="input-field">
            <input type="password"  v-model="form.password" />
            {{form.password}}
            <label for="password">Senha</label>
        </div>
        <button class="btn center green" @click.prevent="postAPI()">Post</button>
        <h2>{{ responsePostAPI }}</h2>
        </form>
    </div>
    <div  class="center">
      <h1 class="light">Login</h1>
      <form>
        <div style="margin-left: 40%; width: 300px;" class="input-field">
            <input type="text" v-model="email"/>
            {{email}}
            <label for="email">Nome</label>
        </div>
        <div style="margin-left: 40%; width: 300px;" class="input-field">
            <input type="password"  v-model="password" />
            {{password}}
            <label for="password">Senha</label>
        </div>
        <button class="btn center green" @click.prevent="login()">Login</button>
        <h2>{{ responsePostAPI }}</h2>
        <button class="btn center green" @click.prevent="logOut()">LogOut</button>
        </form>
        <div class="center">
        <h4>Token</h4>
        {{token}}
        </div>
        <div v-if="token" class="center">
        <h4>Conta Privada</h4>
        </div>
    </div>
  </div>
</template>

<script>
import axios from "axios"
export default {
    data(){
        return{
        responseGetAPI: "",
        responsePostAPI: "",
        form:{
            email: "",
            password: "",
        },
        email:"",
        password:"",
        token: localStorage.getItem('token') || null
        };
    },
    methods: {
        getAPI: async function (){
        console.log("getAPI")
        await axios.get('http://cpp-api.herokuapp.com/').then(res => {
        console.log(res)
        console.log(res.data)
        this.responseGetAPI = res.data.message
        console.log(res.data.message)
        });
        },
        postAPI: async function (){
        console.log("postAPI");
        const res = await axios.post('http://backend-upload-zetta.herokuapp.com/auth/register', 
        {email: this.form.email, password: this.form.password})
            console.log(res)
            console.log(res.data)
        },
        login: async function (){
        console.log("postAPI");
        const res = await axios.post('http://backend-upload-zetta.herokuapp.com/auth/authenticate', 
        {email: this.email, password: this.password})
            console.log(res)
            console.log(res.data)
            if(res.data.token){
                const token = res.data.token
                this.token = token
                localStorage.setItem('token', token)
            }
        },
        logOut: async function(){
        await localStorage.removeItem('token')
        this.token = null
       }
    }

}        
</script>

<style>
</style>