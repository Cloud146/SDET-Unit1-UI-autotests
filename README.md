# SDET-Unit1-UI-autotests

## Задача U1. Создание проекта с автотестами с нуля

1. Главная страница https://www.way2automation.com/
    Проверить открытие страницы и наличие следующих элементов:
  - верхнее горизонтальное меню
  - футер
2.  Протестировать блок с курсами на главной странице (проверить что работает слайдер)
3. Создать проверку, что при скроллинге отображается основное меню в шапке на главной

## Задача U2. Allure

1. Добавить в проект отчеты Allure.rr
2. Добавить аннотацию Severity к каждому тест кейсу
3. Добавить аннотацию Step к каждому публичному методу всех Page Object
4. Добавить аннотации Epic, Feature, Story

## Задача U3. DataProvider

1. Сделать новый test suite
2. Разработать универсальный тест кейс, использующий разные данные для авторизации (в том числе и некорректные). Ссылка на форму логина - https://www.way2automation.com/angularjs-protractor/registeration/#/login
3. В качестве источника разных параметров использовать возможность TestNG DataProvider

## Задача U4. Screenshots

В проекте с Allure добавить поддержку скриншотов, делать скриншот при падении теста. 
Специально добавить несколько падающих кейсов для демонстрации фичи в отчете Allure.

## Задача U5. Cookies

ВАЖНО: ссылку на форму авторизации c рабочими куками рекомендуется взять из сайта с упражнениями sql

1. Написать функцию записи куков в файл и считывания куков из него.
2. Написать тест, авторизующийся при первом запуске и использующий куки при втором (куки брать из предыдущего прогона)
3. Залить в проект
