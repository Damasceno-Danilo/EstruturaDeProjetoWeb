package com.projetoWeb.qa.steps;

import com.projetoWeb.qa.core.Browser;
import com.projetoWeb.qa.core.DriverFactory;
import com.projetoWeb.qa.pages.LoginPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

import java.util.Map;

public class LoginSteps {

    LoginPage loginPage;

    @Before
    public void iniciaNavegador() {
        new DriverFactory(Browser.CHROME);

    }

    @After
    public void fechaNavegador() {
      DriverFactory.getDriver().quit();
    }

    @Dado("que a modal esteja sendo exibida")
    public void que_a_modal_esteja_sendo_exibida() {
        DriverFactory.getDriver().get("https://www.google.com.br/");
        loginPage = new LoginPage();


    }

    @Quando("for realizado um clique fora da modal")
    public void for_realizado_um_clique_fora_da_modal() {

    }

    @Entao("a janela modal deve ser fechada")
    public void a_janela_modal_deve_ser_fechada() throws Exception {

    }

    @Quando("for realizado um clique no ícone de fechar da modal")
    public void for_realizado_um_clique_no_ícone_de_fechar_da_modal() {

    }

    @Quando("for realizado um clique no link Create New Account")
    public void for_realizado_um_clique_no_link_create_new_account() {

    }

    @Entao("a pagina Create Account deve ser exibida")
    public void a_pagina_create_account_deve_ser_exibida() {

    }

    @Quando("os campos de login sejam preenchidos da seguinte forma")
    public void os_campos_de_login_sejam_preenchidos_da_seguinte_forma(Map<String, String> map) {

    }
    @Quando("for realizado o clique no botao sign in")
    public void for_realizado_o_clique_no_botao_sign_in() {

    }
    @Entao("deve ser possivel logar no sistema")
    public void deve_ser_possivel_logar_no_sistema() {

    }

    @Entao("o sistema devera exibir uma mensagem de erro")
    public void o_sistema_devera_exibir_uma_mensagem_de_erro() {

    }

    @Entao("o botao sign in deve permanecer desabilitado")
    public void o_botao_sign_in_deve_permanecer_desabilitado() {

    }


}
