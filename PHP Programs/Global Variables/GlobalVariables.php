<?php
    $name = "Kavindu";
    function sayHello() {
        GLOBAL $name;
        echo "Global variable name: $name" .PHP_EOL . "😎🫶 <br>";
        $name = "KavinduDarshana";
        echo "Global variable name changed to: $name" .PHP_EOL . "🅰️🌬️<br>";
    }
    sayHello();
    echo "Global variable name after function call: $name" .PHP_EOL . "🥅👨‍💻";
?>