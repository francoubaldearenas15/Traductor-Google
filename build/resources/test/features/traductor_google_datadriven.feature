#Author: you.email@your.domain.com
  Feature: Traductor
    Como un usuario
    Quiero ingresar a Google Translator
    A traducir palabras en diferentes leguajes
    @traducir
    Scenario Outline: Traducir de Ingles a Espanol
      Given que Yeison quiere usar el traductor de Google
      When el traduce una palabra de ingles a espanyol <origen> <destino> <palabrai>
      Then el deberia ver en la pantalla la palabra traducida del idioma origen a idioma destino <palabrae>
      Examples:
        |origen   |destino |palabrai|palabrae |
        |inglés   |español |table   |mesa    |
        |inglés   |español |orange  |naranja  |