<?php
    $x = 10;
    $y = 20;

    function addition() {
        $z = $GLOBALS['x']+$GLOBALS['y'];
        $GLOBALS['z'] = $z;
    }

    function multiplication() {
        $p = $GLOBALS['x'] * $GLOBALS['y'];
        $GLOBALS['p'] = $p;
    }

    addition();
    echo "Now z is the global variable. Addition is $z ➕" . PHP_EOL . "<br>";

    multiplication();
    echo "Now p is the global variable. Multiplication is $p ✖️" . PHP_EOL;
?>