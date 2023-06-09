# Проект автоматизации тестирования для <a target="_blank" href="https://vkusvill.ru/">STOPGAME</a> 
<img src="img/screen/stopgame.jpg" alt="Allure"/>

## :open_book: Содержание:
- [Технологии и инструменты](#gear-в-проекте-используются-следующие-технологии-и-инструменты)
- [Что проверяем](#heavy_check_mark-что-проверяем)
- [Запуск тестов из Jenkins](#-запуск-тестов-из-jenkins)
- [Запуск тестов из терминала](#computer-запуск-тестов-из-терминала)
- [Отчеты](#bar_chart-отчеты-о-прохождении-тестов-доступны-в-allure)
- - [Allure](#-allure)
- - [Telegram](#-telegram)
- [Видео с прогоном тестов](#movie_camera-видео-с-прогоном-тестов)


## :gear: В проекте используются следующие технологии и инструменты:

<p align="center">
<img src="img/logo/Idea.svg" width="50" height="50"  alt="IDEA"/>
<img src="img/logo/Java.svg" width="50" height="50"  alt="Java"/>
<img src="img/logo/GitHub.svg" width="50" height="50"  alt="Github"/>
<img src="img/logo/Junit5.svg" width="50" height="50"  alt="JUnit 5"/>
<img src="img/logo/Gradle.svg" width="50" height="50"  alt="Gradle"/>
<img src="img/logo/Selenide.svg" width="50" height="50"  alt="Selenide"/>
<img src="img/logo/Selenoid.svg" width="50" height="50"  alt="Selenoid"/>
<img src="img/logo/Allure.svg" width="50" height="50"  alt="Allure"/>
<img src="img/logo/Jenkins.svg" width="50" height="50"  alt="Jenkins"/>
<img src="img/logo/Telegram.svg" width="50" height="50"  alt="Telegram"/>
<img src="img/logo/Allure.svg" width="50" height="50"  alt="Allure"/>
</p>

## :heavy_check_mark: Что проверяем

> - Проверка кликабельности разделов в header ;
> - Проверка возврата на главную страницу по нажатии логотипа ;
> - Проверка переключения разделов в блоке "Редакция" ;
> - Проверка доступности окна "Новые комментарии" ;
> - Проверка поиска на сайте.

## <img width="4%" title="Jenkins" src="img/logo/Jenkins.svg"> Запуск тестов из [Jenkins](https://jenkins.autotests.cloud/job/Students/job/JenkinsForm/33/allure/#suites/49d29e6b5c2859a8a4d53f6ce26bd4a5)

Для запуска тестов из Jenkins:
1. Необходимо нажать кнопку "Собрать с параметрами".
<img src="img/screen/JUI2.PNG" alt="Jenkins"/>
2. Выбрать параметры.
<img src="img/screen/JUI.PNG" alt="Jenkins"/>
3. Нажать кнопку "Собрать".

### :earth_asia: Удаленный запуск тестов

```bash
gradle clean
tests_ui
-DbrowserSize="${BROWSER_SIZE}"
-Dbrowser="${BROWSER}"
-DbrowserVersion="${BROWSER_VERSION}"
-DbaseUrl="${BASE_URL}"
-DremoteUrl="${REMOTE_URL}"
```

### :heavy_plus_sign: Параметры сборки

> - BROWSER (браузер)
> - VERSION (версия браузера)
> - RESOLUTION (размер окна браузера)
> - BASEURL (адрес сайта)

## :computer: Запуск тестов из терминала

Для локального запуска необходимо выполнить команду:
```
gradle clean
tests_ui
```

## :bar_chart: Отчеты о прохождении тестов доступны в Allure

### <img width="3%" title="Allure" src="img/logo/Allure.svg"> Allure

#### Главная страница

<img src="img/screen/JAllur.PNG" alt="Allure"/>

#### Тесты

<img src="img/screen/JAllure2.PNG" alt="Allure"/>

### <img width="3%" title="Telegram" src="img/logo/Telegram.svg"> Telegram

Настроена отправка оточета ботом в Telegram

<img src="img/screen/JTeleg.PNG" alt="Telegram"/>

## :movie_camera: Видео с прогоном тестов

В отчетах Allure для каждого теста прикреплен не только скриншот, но и видео прохождения теста

<p align="center">
  <img title="Video" src="img/gif/stop.gif">
</p>


