<?php
    include 'indexPHP.php';
    function mySelf() {
        echo "My name is " . $GLOBALS["name"] . " 😎👨‍💻<br>";
        echo "My age is " . $GLOBALS["age"] . " 👤<br>";
        print "My height is " . $GLOBALS["height"] . " 🚹<br>";
        print "My weight is " .$GLOBALS["weight"] . " 🛂<br>";
    }
    mySelf();
?>
