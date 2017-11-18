Feature: Conversión de Celsius a Fahrenheit
  Como usuario decido las escalas de temperaturas que aparecen en la tabla.
  Scenario: Mostrar tabla de conversión de Celsius a Fahrenheit
    Given tengo una tabla
    And añado un conversor de Celsius a Fahrenheit
    When muestro la tabla
    Then debe aparecer la tabla
    And la primera línea debe contener 0 para grados Celsius
    And la primera lína debe contener 32 para grados Fahrenheit