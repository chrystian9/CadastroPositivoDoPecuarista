<template>
  <div class="about">
    <header>
    <ul class="side-nav" id="menu-mobile">
			<li><a class="hide-menu">Olá, Pecuarista!</a></li>
			<li><a class="hide-menu">Ver Perfil</a></li>
      <li><a class="hide-menu" href="/">Sair</a></li>
		</ul>
      <div class="navbar-fixed">
        <nav class="navbar z-depth-0">
          <div class="nav-wrapper container">
            <h1 class="logo_text">Cadastro Positivo de Pecuaristas</h1>
            <a href=""
              ><img class="logo_img" src="img/logo.png" alt="CadastroPositivo"
            /></a>
            <ul class="right light hide-on-med-and-down ul">
              <li><a>Olá, Pecuarista!</a></li>
              <li><a href="#sobre">Ver Perfil</a></li>
              <li>
                <a href="/"
                  >Sair</a
                >
              </li>
            </ul>
            <a href="#menu-mobile" data-activates="menu-mobile" class="button-collapse right"><i class="material-icons greenIcon">menu</i></a>
          </div>
        </nav>
      </div>
    </header>
    <section class="servicos bloco scrollspy" id="servicos">
      <div class="row container">
        <div class="col s12 center">
          <h2 class="light">Cadastro Positivo de Pecuaristas</h2>
          <p class="light">
            O Cadastro Positivo de Pecuaristas analisa se o pecuarista
            está de acordo com as leis ambientais usando os dados cadastrados pelo usuário.<br>
            Selecione uma das opções.
          </p>
        </div>
      </div>
      <div class="row container">
        <article class="col s12 m6 l3">
          <div class="card">
            <div class="card-image">
              <img
                src="img/score.png"
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
                Dentro do CPE se pode verificar se o produtor está positivo ou
                não de acordo com as leis ambientais, gerando um score.
              </p>
              <br />
              <div class="row center btn-horario">
                <a
                  href="/score"
                  class="btn btn-large blue-logo"
                  ><i class="material-icons left"></i> Gerar Score
                </a>
              </div>
            </div>
          </div>
        </article>
        <div class="modal" id="pilates-modal">
          <div class="modal-content">
            <h5 class="light">Produtor Positivo</h5>
            <p class="light black-text">
              No Cadastro Positivo o pecuarista pode gerar um Score para saber se ele está positivo ou não.
            </p>
            <h5 class="light">O Score é calculado de acordo com os seguintes aspectos:</h5>
            <ul class="collection">
              <li class="collection-item">
                Número do Car;
              </li>
              <li class="collection-item">Outorga da água;</li>
              <li class="collection-item">
                Descarte de Resíduos Sólidos;
              </li>
              <li class="collection-item">Licenciamento Ambiental;</li>
              <li class="collection-item">
                Cadastro no IBAMA;
              </li>
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
                de positividade do Pecuarista
              </p>
              <br />
              <div class="row center btn-horario">
                <a
                  href="#login-modal"
                  class="btn btn-large blue-logo modal-trigger"
                  ><i class="material-icons left"></i> Gerar Certificado
                </a>
              </div>
            </div>
          </div>
        </article>
        <div class="modal" id="nutricao-modal">
          <div class="modal-content">
            <h5 class="light">Geração de certificado</h5>
            <p class="light black-text">
              No Cadastro Positivo de Pecuaristas é possível gerar um relátorio que comprova
              que o produtor está de acordo com as leis ambientais vigentes.
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
                src="img/contatos.png"
                alt="Fisioterapia"
                class="materialboxed"
              />
              <a href="#analise-modal" class="btn btn-floating halfway-fab blue-logo">
                <i class="material-icons">info</i>
              </a>
            </div>
            <div class="card-content">
              <h3 class="card-title">Ctts. dos Frigoríficos</h3>
              <p class="light">
                Dentro do Cadastro Positivo de Pecuaristas
                os pecuaristas tem acesso a lista de contatos dos frigoríficos.
              </p>
              <br />
              <div class="row center btn-horario">
                <a
                  href="#login-modal"
                  class="btn btn-large blue-logo modal-trigger"
                  ><i class="material-icons left"></i> Listar Contatos
                </a>
              </div>
            </div>
          </div>
        </article>
        <div class="modal" id="analise-modal">
          <div class="modal-content">
            <h5 class="light">Geração de certificado</h5>
            <p class="light black-text">
              No Cadastro Positivo de Pecuaristas é possível gerar um relátorio que comprova
              que o produtor está de acordo com as leis ambientais vigentes.
            </p>
          </div>
          <div class="modal-footer">
            <a class="btn blue-logo modal-action modal-close"> Sair </a>
          </div>
        </div>
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
                No CPP é possível verificar os dados do perfil do produtor Rural
                Brasileiro cadastrados por ele na plataforma.
              </p>
              <br />
              <div class="row center btn-horario">
                <a
                  href="#login-modal"
                  class="btn btn-large blue-logo modal-trigger"
                  ><i class="material-icons left"></i> Atualizar Dados
                </a>
              </div>
            </div>
          </div>
        </article>
      </div>
      <footer class="rodape">
        <div class="row container center">
          <img src="img/whitelogo.png" class="logo_img" />
          <p class="light white-text">
            © Cadastro Positivo de Pecuaristas - Zetta Lab
          </p>
        </div>
      </footer>
    </section>
  </div>
</template>
