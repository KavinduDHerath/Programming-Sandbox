<?php
    $x = 10;
    $y = 20;

    function addition() {
        $z = $GLOBALS['x'] + $GLOBALS['y'];
        echo " x ➕ y 🟰 $z ✅" .PHP_EOL ."<br>";
    }

    function multiplication() {
        $p = $GLOBALS['x'] * $GLOBALS['y'];
        print "x ✖️ y 🟰 $p ✅" .PHP_EOL;
    }

    addition();
    multiplication();
?>
