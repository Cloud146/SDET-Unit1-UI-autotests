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

## Задача U6. JavaScriptExecutor

1. С помощью JavaScriptExecutor убрать фокус из поля ввода
2. С помощью JavaScriptExecutor определить наличие скролла на странице
3. Вынести код JavaScriptExecutor в отдельные функции, пометить каждую как Step
4. Реализовать тест-кейс, использующий описанный функционал, залить в проект

## Задача U7. Параллельный запуск тестов(!)

1. Написать отдельную testng.xml конфигурацию для многопоточного запуска тестов (минимум два потока, каждый suite в своём потоке)
2. Написать bat и sh скрипты для развертывания Selenium GRID (hub и node), позволяющий прогнать автотесты в нужном количестве потоков
3. Залить всё необходимое для многопоточного запуска в проект

## Задача U8. Перезапуск упавших тестов

1. Настроить автоматический повторный запуск упавших кейсов, указать 2 попытки перезапуска
2. Написать скрипт, для выполнения только упавших кейсов с предыдущего прогона
3. Залить обе наработки в проект

## Задача U9. Браузеры

1. Настроить запуск автотестов на разных браузерах, без GRID:
- Chrome
- FireFox
- Edge
- IE (обеспечить запуск без правок в реестре, использовать capability)
2. Настроить запуск автотестов на разных браузерах, с использованием GRID
3. Разработать класс DriverFactory, создающий различные WebDriver в зависимости от входных параметров (любые браузеры, с GRID и без него)
4. Залить наработки и всё необходимое для запуска на перечисленных браузерах в проект (предусмотреть драйвера для Windows)

## Задача U10. Drag n Drop (IFrame)

1. Открыть http://way2automation.com/way2auto_jquery/droppable.php
2. Перетащить элемент в принимающий
3. Убедиться, что текст принимающего элемента изменился
4. Залить кейс в проект

## Задача U11. Tabs

1. Открыть http://way2automation.com/way2auto_jquery/frames-and-windows.php
2. Нажать на ссылку
3. Перенести фокус на новую вкладку, нажать ссылку
4. Убедиться, что открылась третья вкладка
5. Залить кейс в проект

## Задача U12. Alerts

1. Открыть http://way2automation.com/way2auto_jquery/alert.php
2. Нажать Input Alert
3. Нажать кнопку, ввести кастомный текст, подтвердить
4. Убедиться, что текст применился
5. Залить кейс в проект

## Задача U13. Basic auth

1. Открыть https://www.httpwatch.com/httpgallery/authentication/#showExample10
2. Нажать на кнопку "Display Image"
3. Пройти авторизацию (логин "httpwatch" пароль "httpwatch")
4. Убедиться, что авторизация прошла успешно
5. Залить кейс в проект

