<template>
  <div class="home">
    <header>
      <ul class="side-nav" id="menu-mobile">
        <li><a class="hide-menu">Home</a></li>
        <li><a class="hide-menu">Sobre o CPP</a></li>
        <li><a class="hide-menu" href="">Serviços</a></li>
        <li><a class="hide-menu" href="">Contato</a></li>
      </ul>
      <div class="navbar-fixed">
        <nav class="navbar z-depth-0">
          <div class="nav-wrapper container">
            <h1 class="logo_text">Cadastro Positivo de Pecuaristas</h1>
            <a href=""
              ><img class="logo_img" src="img/logo.png" alt="CadastroPositivo"
            /></a>
            <ul class="right light hide-on-med-and-down ul">
              <li><a href="#home">Home</a></li>
              <li><a href="#sobre">Sobre o CPP</a></li>
              <li><a href="#servicos">Serviços</a></li>
              <li><a href="#contato">Contato</a></li>
            </ul>
            <a
              href="#menu-mobile"
              data-activates="menu-mobile"
              class="button-collapse right"
              ><i class="material-icons greenIcon">menu</i></a
            >
          </div>
        </nav>
      </div>
    </header>
    <section class="home bloco scrollspy" id="home">
      <div class="row container banner">
        <div class="col s12 center">
          <h2 class="white-text">Cadastro Positivo de Pecuaristas</h2>
          <p class="white-text light">A carne brasileira com garantia de sustentabilidade ambiental !</p>
          <div class="row">
            <button
              href="#horarios-modal"
              class="btn btn-large blue-logo modal-trigger"
              @click.prevent="getAPI()"
            >
              Pecuarista
            </button>
            &nbsp;&nbsp;&nbsp;&nbsp;
            <a
              href="#login-modal"
              class="btn btn-large brown white-text modal-trigger"
            >
              Frigorífico
            </a>
          </div>
        </div>
      </div>
      <div class="modal" id="login-modal">
        <div class="modal-content">
          <h4 class="light">Frigorífico</h4>
          <ul class="tabs">
            <li class="tab col s3">
              <a style="color: #673a01" href="#form-login-frigorifico">Login</a>
            </li>
          </ul>
          <div class="col s12 m6 l4" id="form-login-frigorifico">
            <div class="formulario white black-text">
              <form @submit.prevent="submitFrigorifico()">
                <div class="input-field">
                  <input type="text" name="cnpjf" id="cnpjf" v-model="frigorifico.cnpjf" />
                  <label for="cnpjf">Seu CNPJ</label>
                </div>
                <button class="btn brown" type="submit" >Entrar</button>
                &nbsp;&nbsp;&nbsp;&nbsp;
                <a class="btn brown modal-action modal-close"> Voltar </a>
              </form>
            </div>
          </div>
        </div>
      </div>
      <div class="modal" id="horarios-modal">
        <div class="modal-content">
          <h4 class="light">Pecuarista</h4>
          <ul class="tabs">
            <li class="tab col s3">
              <a class="active" href="#form-pecuarista">Cadastro</a>
            </li>
            &nbsp;&nbsp;&nbsp;&nbsp;
            <li class="tab col s3">
              <a class="active" href="#login-pecuarista">Login</a>
            </li>
          </ul>
          <div class="col s12 m6 l4" id="form-pecuarista">
            <div class="formulario white black-text">
              <form>
                <div class="input-field">
                  <input type="text" name="nome" id="nome" v-model="form.nome" />
                  <label for="nome">Nome</label>
                </div>
                <div class="input-field">
                  <input type="text" name="cnpj" id="cnpj" v-model="form.cnpj" />
                  <label for="cnpj(Somente números">CNPJ (Somente números)</label>
                </div>
                <div class="input-field">
                  <input type="password" name="senha" id="senha" v-model="form.senha" />
                  <label for="senha">Digite sua senha</label>
                </div>
                <div class="input-field">
                  <input type="text" name="car" id="car" v-model="form.car" />
                  <label for="car">Cadastro Ambiental Rural (CAR)</label>
                </div>
                <div class="input-field">
                  <input type="text" name="estadocar" id="estadocar" v-model="form.estadocar" />
                  <label for="estadocar">Estado do CAR ( Ex: Ativo, Pendente, Suspenso, Cancelado, Não Possui )</label>
                </div>
                <div class="input-field">
                  <input type="text" name="regularidade" v-model="form.regularidade"/>
                  <label for="regularidade">Certificado de Regularidade ( Ex: Ativo, Vencido, Não possui )</label>
                </div>
                <div class="input-field">
                  <input type="text" name="outorga" v-model="form.outorga"/>
                  <label for="regularidade">Outorga da Água ( Ex: Possui, Não Possui )</label>
                </div>
                <div class="input-field">
                  <input type="text" name="licenciamento" v-model="form.licenciamento"/>
                  <label for="regularidade">Licenciamento Ambiental ( Ex: Deferido, Indeferido, Arquivado, Cancelado, Não Possui )</label>
                </div>
                <div class="input-field">
                  <input type="text" name="comprovante" v-model="form.comprovante"/>
                  <label for="regularidade"> Comprovante de descarte de Resíduos Sólidos ( Ex: Faz, Não Faz )</label>
                </div>
                <p>
                  <input
                    type="checkbox"
                    class="filled-in"
                    id="filled-in-box"
                    checked="checked"
                  />
                  <label for="filled-in-box"
                    >Declaro que todas as informações acima são
                    verdadeiras</label
                  >
                </p>
                <button class="btn blue-logo" type="submit" @click.prevent="postAPI()">Cadastrar</button>
                &nbsp;&nbsp;&nbsp;&nbsp;
                <a class="btn blue-logo modal-action modal-close"> Voltar </a>
              </form>
            </div>
          </div>
          <div class="col s12 m6 l4" id="login-pecuarista">
            <div class="formulario white black-text">
              <form>
                <div class="input-field">
                  <input required type="text" v-model="cnpj"/>
                  <label for="cnpj">Seu CNPJ</label>
                </div>
                <div class="input-field">
                  <input required type="password"  v-model="senha"/>
                  <label for="senha">Sua senha</label>
                </div>
                <button class="btn blue-logo" @click.prevent="login()">Entrar</button>
                &nbsp;&nbsp;&nbsp;&nbsp;
                <a class="btn blue-logo modal-action modal-close"> Voltar </a>
              </form>
            </div>
          </div>
        </div>
      </div>
    </section>
    <section class="sobre bloco scrollspy" id="sobre">
      <div class="row container">
        <div class="col s12 center">
          <h2 class="light titulo">Sobre o CPP</h2>
        </div>
        <div class="col s12 l6">
          <p class="light">
            O Cadastro Positivo de Pecuaristas(CPP), é uma plataforma online
            para cadastro e fiscalização dos pecuaristas brasileiros em relação
            a sustentabilidade ambiental. Facilitar a relação entre pecuaristas
            e frigorífcos. Além de dar credibilidade ao produtor com a
            sociedade, mostrando que ele está respeitando os códigos ambientais.
            Tornar-se referência no cenário de rastreabilidade na
            pecuária,verificando o quão positivo é o produtor com relação as
            leis ambientais, além de promover a diminuição do preconceito da
            sociedade em geral com os pecuaristas. Agir com ética frente aos
            pecuaristas e demais usuários.<br />
            Melhorar o relacionamento dos pecuristas com os frigoríficos e a
            população.<br />
            Criar transparência dos produtores de carne do país com a sociedade,
            tendo como contra partida ótimos benefícios para eles.
          </p>
        </div>
        <div class="col s12 l6">
          <div class="carousel carousel-slider" data-indicators="true">
            <a href="#" class="carousel-item">
              <img alt="Imagem institucional" src="img/sobre1.png" />
            </a>
            <a href="#" class="carousel-item">
              <img alt="Imagem institucional" src="img/sobre2.png" />
            </a>
            <a href="#" class="carousel-item">
              <img alt="Imagem institucional" src="img/sobre3.png" />
            </a>
          </div>
        </div>
      </div>
      <div class="row blue-logo missao-visao-valores">
        <div class="container">
          <article class="item col s12 m4 center">
            <span class="icon"
              ><i class="material-icons medium">directions_run</i></span
            >
            <h3 class="light">Missão</h3>
            <p class="light">
              Facilitar a relação entre pecuaristas e frigorífcos. Além de dar
              credibilidade ao produtor com a sociedade, mostrando que ele está
              respeitando os códigos ambientais.
            </p>
          </article>
          <article class="item col s12 m4 center">
            <span class="icon"
              ><i class="material-icons medium">visibility</i></span
            >
            <h3 class="light">Visão</h3>
            <p class="light">
              Tornar-se referência no cenário de rastreabilidade na
              pecuária,verificando se o produtor é positivo com relação as leis
              ambientais, além de promover a diminuição do preconceito da
              sociedade em geral com os pecuaristas.
            </p>
          </article>
          <article class="item col s12 m4 center">
            <span class="icon"><i class="material-icons medium">grade</i></span>
            <h3 class="light">Valores</h3>
            <p class="light">
              • Agir com ética frente aos pecuaristas e demais usuários.<br />
              • Melhorar o relacionamento dos pecuristas com os frigoríficos e a
              população.<br />
              • Criar transparência dos produtores de carne do país com a
              sociedade, tendo como contra partida ótimos benefícios para eles.
            </p>
          </article>
        </div>
      </div>
    </section>
    <section class="servicos bloco scrollspy" id="servicos">
      <div class="row container">
        <div class="col s12 center">
          <h2 class="light">Serviços</h2>
          <p class="light">
            Para oferecer serviços de acordo com a realidade e necessidade de
            cada região do Brasil, o Cadastro Positivo de Pecuaristas pode fazer
            consultas de acordo com o usuário logado. Para que então ele possa
            verificar as informações que ele desejar.
          </p>
        </div>
      </div>
      <div class="row container">
        <article class="col s12 m6 l3">
          <div class="card">
            <div class="card-image">
              <img
                src="img/verificar.jpg"
                alt="Pilates"
                class="materialboxed"
              />
              <a
                href="#pilates-modal"
                class="btn btn-floating halfway-fab blue-logo modal-trigger"
              >
                <i class="material-icons">info</i>
              </a>
            </div>
            <div class="card-content">
              <h3 class="card-title">Produtor Positivo</h3>
              <p class="light">
                Dentro do CPE se pode ferificar se o produtor está positivo ou
                não de acordo com as leis ambientais.
              </p>
            </div>
          </div>
        </article>
        <div class="modal" id="pilates-modal">
          <div class="modal-content">
            <h5 class="light">Produtor Positivo</h5>
            <p class="light black-text">
              No Cadastro Positivo o pecuarista pode gerar um Score para saber
              se ele está positivo ou não.
            </p>
            <h5 class="light">
              O Score é calculado de acordo com os seguintes aspectos:
            </h5>
            <ul class="collection">
              <li class="collection-item">Número do Car;</li>
              <li class="collection-item">Outorga da água;</li>
              <li class="collection-item">Descarte de Resíduos Sólidos;</li>
              <li class="collection-item">Licenciamento Ambiental;</li>
              <li class="collection-item">Cadastro no IBAMA;</li>
            </ul>
          </div>
          <div class="modal-footer">
            <a class="btn blue-logo modal-action modal-close"> Sair </a>
          </div>
        </div>
        <article class="col s12 m6 l3">
          <div class="card">
            <div class="card-image">
              <img
                src="img/certificado.jpg"
                alt="Nutrição"
                class="materialboxed"
              />
              <a
                href="#nutricao-modal"
                class="btn btn-floating halfway-fab blue-logo modal-trigger"
              >
                <i class="material-icons">info</i>
              </a>
            </div>
            <div class="card-content">
              <h3 class="card-title">Gerar Certificado</h3>
              <p class="light">
                No Cadastro Positivo de Pecuaristas se pode gerar o certificado
                de positividade
              </p>
            </div>
          </div>
        </article>
        <div class="modal" id="nutricao-modal">
          <div class="modal-content">
            <h5 class="light">Geração de certificado</h5>
            <p class="light black-text">
              No Cadastro Positivo de Pecuaristas é possível gerar um relátorio
              que comprova que o produtor está de acordo com as leis ambientais
              vigentes.
            </p>
          </div>
          <div class="modal-footer">
            <a class="btn blue-logo modal-action modal-close"> Sair </a>
          </div>
        </div>
        <article class="col s12 m6 l3">
          <div class="card">
            <div class="card-image">
              <img
                src="img/aprovadoreprovado.jpg"
                alt="Fisioterapia"
                class="materialboxed"
              />
              <a class="btn btn-floating halfway-fab blue-logo">
                <i class="material-icons">info</i>
              </a>
            </div>
            <div class="card-content">
              <h3 class="card-title">Análise do Pecuarista</h3>
              <p class="light">
                O Cadastro positivo analisa se ele está ou não de acordo com as
                leis ambientais.
              </p>
            </div>
          </div>
        </article>
        <article class="col s12 m6 l3">
          <div class="card">
            <div class="card-image">
              <img src="img/dados.png" alt="Funcional" class="materialboxed" />
              <a class="btn btn-floating halfway-fab blue-logo">
                <i class="material-icons">info</i>
              </a>
            </div>
            <div class="card-content">
              <h3 class="card-title">Dados do Produtor</h3>
              <p class="light">
                Dentro do CPP é possível verificar os dados públicos do produtor
                Rural Brasileiro.
              </p>
            </div>
          </div>
        </article>
      </div>
      <div class="row center btn-horario">
        <a href="#login-modal" class="btn btn-large blue-logo modal-trigger"
          ><i class="material-icons left"></i> Entrar no Cadastro Positivo
        </a>
      </div>
    </section>
    <section class="contato bloco scrollspy" id="contato">
      <div class="row container">
        <div class="col s12 center">
          <h2 class="titulo light black-text">Contato</h2>
        </div>
        <div class="col s12 m6 l4 hide-on-med-only">
          <div class="mapa transparent">
            <iframe
              src="https://www.google.com/maps/embed?pb=!1m14!1m8!1m3!1d14876.572313965866!2d-44.974366!3d-21.2261742!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x0%3A0x3db8f8d764afc2bc!2sLEMAF%20-%20Laborat%C3%B3rio%20de%20Manejo%20Florestal!5e0!3m2!1spt-BR!2sbr!4v1611179392682!5m2!1spt-BR!2sbr"
              width="600"
              height="450"
              frameborder="0"
              style="border: 0"
              allowfullscreen=""
              aria-hidden="false"
              tabindex="0"
            ></iframe>
          </div>
        </div>
        <div class="col s12 m6 l4">
          <div class="informacoes black-text">
            <h4>Redes sociais</h4>
            <p class="light">
              Fique por dentro das novidades, receba dicas, ou simplesmente
              indique a amigos pecuaristas esse projeto sensacional!
            </p>
            <a href="#" class="btn-floating blue-logo"
              ><i class="fab fa-instagram"></i
            ></a>
            <a href="#" class="btn-floating blue-logo"
              ><i class="fab fa-facebook"></i
            ></a>
            <a href="#" class="btn-floating blue-logo"
              ><i class="fab fa-twitter"></i
            ></a>
            <h4>Endereço</h4>
            <p class="light">Aquenta Sol, Lavras - MG, 37200-900</p>
            <h4>Contatos</h4>
            <p class="light">(31) 99654-9224 <br /></p>
          </div>
        </div>
        <div class="col s12 m6 l4">
          <div class="formulario white black-text">
            <h4>Fale conosco</h4>
            <p class="light">
              Dúvidas, criticas ou sujestões? Entre em contato conosco, seu
              feedback é muito importante.
            </p>
            <form>
              <div class="input-field">
                <input type="text" name="name" id="name" />
                <label for="name">Seu nome</label>
              </div>
              <div class="input-field">
                <input type="email" name="email" id="email" />
                <label for="email">Seu email</label>
              </div>
              <div class="input-field">
                <input type="text" name="subject" id="subject" />
                <label for="subject">Assunto</label>
              </div>
              <div class="input-field">
                <textarea
                  id="message"
                  name="message"
                  class="materialize-textarea"
                ></textarea>
                <label for="message">Mensagem</label>
              </div>
              <button class="btn blue-logo" type="submit">Enviar</button>
            </form>
          </div>
        </div>
      </div>
    </section>
    <div class="depoimentos blue-logo">
      <div class="row container">
        <div class="col s12 center">
          <h2 class="titulo white-text light">Depoimentos</h2>
        </div>
        <div class="col s12 m4 center">
          <img
            src="img/depo1.jpg"
            class="circle responsive-img"
            alt="Depoimento um"
          />
          <p class="light white-text">
            "Conheci o Cadastro Positivo de Pecuaristas pela Zetta e está
            ajudando muito no meu relacionamento com os frigoríficos"
          </p>
          <h4 class="light white-text">José Souza</h4>
          <p class="white-text">
            <i class="material-icons">star</i>
            <i class="material-icons">star</i>
            <i class="material-icons">star</i>
            <i class="material-icons">star</i>
            <i class="material-icons">star</i>
          </p>
        </div>
        <div class="col s12 m4 center">
          <img
            src="img/depo2.jpg"
            class="circle responsive-img"
            alt="Depoimento de Bruno"
          />
          <p class="light white-text">
            Conheci o Cadastro Positivo de Pecuaristas pela Zetta e está
            ajudando muito no meu relacionamento com os frigoríficos"
          </p>
          <h4 class="light white-text">Bruno Valério</h4>
          <p class="white-text">
            <i class="material-icons">star</i>
            <i class="material-icons">star</i>
            <i class="material-icons">star</i>
            <i class="material-icons">star</i>
            <i class="material-icons">star</i>
          </p>
        </div>
        <div class="col s12 m4 center">
          <img
            src="img/depo3.jpg"
            class="circle responsive-img"
            alt="Depoimento um"
          />
          <p class="light white-text">
            "Conheci o Cadastro Positivo de Pecuaristas pela Zetta e está
            ajudando muito no meu relacionamento com os frigoríficos"
          </p>
          <h4 class="light white-text">João Souza</h4>
          <p class="white-text">
            <i class="material-icons">star</i>
            <i class="material-icons">star</i>
            <i class="material-icons">star</i>
            <i class="material-icons">star</i>
            <i class="material-icons">star</i>
          </p>
        </div>
      </div>
    </div>
    <footer class="rodape white" style="background-color=white">
      <div class="row container center">
        <img src="img/logo.png" class="logo_img" />
        <p class="light green-text">
          © Cadastro Positivo de Pecuaristas - Zetta Lab
        </p>
      </div>
    </footer>
  </div>
</template>

<script>
import axios from "axios"
export default {
  data() {
    return {
      responseGetAPI: "",
      responsePostAPI: "",
      cnpj:"",
      senha:"",
      form: {
        nome: "",
        cnpj: "",
        senha: "",
        car: "",
        estadocar: "",
        regularidade: "",
        outorga: "",
        licenciamento: "",
        comprovante: "",
      },
      frigorifico: {
        cnpjf: "",
      }
    };
  },
  methods: {
    getAPI: async function (){
        console.log("getAPI")
        await axios.get('https://cpp-api.herokuapp.com/').then(res => {
        console.log(res)
        console.log(res.data)
        this.responseGetAPI = res.data.message
        console.log(res.data.message)
        });
        },
        postAPI: async function (){
        console.log("postAPI");
        const res = await axios.post('https://cpp-api.herokuapp.com/insereCadastroPositivo', 
        {nome: this.form.nome, cnpj: this.form.cnpj, senha: this.form.senha, car:this.form.car, 
        estadocar: this.form.estadocar, regularidade: this.form.regularidade, outorga: this.form.outorga, licenciamento: 
        this.form.licenciamento, comprovante: this.form.comprovante})
            console.log(res)
            console.log(res.data)
            alert("Cadastro Efetuado com Sucesso");
        },
    submitFrigorifico() {
      console.log(this.frigorifico);
    },
    login: async function (){
    console.log("postAPI");
    const res = await axios.post('https://cpp-api.herokuapp.com/loginPecuarista', 
    {cnpj: this.cnpj, senha: this.senha})
    console.log(res)
    console.log(res.data)
    this.$router.push('/pecuarista')
    },
  },
};
</script>
<style>
</style>