<html>    
    <body>
        
    <h1>  &nbsp;My PHP Expressions </h1>
    <?php
    $u = 36;
    $v = 89;
    $w = 27;
    $x = 10;
    $y = 7;
    $z = 13;

    echo "&nbsp;&nbsp;u = " . $u . "<br>";
    echo "&nbsp;&nbsp;v = " . $v . "<br>";
    echo "&nbsp;&nbsp;w = " . $w . "<br>";
    echo "&nbsp;&nbsp;x = " . $x . "<br>";
    echo "&nbsp;&nbsp;y = " . $y . "<br>";
    echo "&nbsp;&nbsp;z = " . $z . "<br> <br>";

    $math1 = $x + $y * 3;
    $math2 = ($u/$v) % $z;
    $math3 = $y ** $z;
    $math4 = ($x == 10)?:"1";
    $math5 = ($u > $y)?:"1";
    $math6 = $x - $y;
    $math7 = $w++;
    $math8 = ++$w;

    echo "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;1. x + y * 3 => " . $math1 . "<br>";
    echo "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;2. (u/v) % z => " . $math2 . "<br>";
    echo "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;3. y^z => " . $math3 . "<br>";
    echo "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;4. Is x equals 10? => " . $math4 . "<br>";
    echo "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;5. Is u greater than y? => " . $math5 . "<br>";
    echo "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;6. x = x-y => " . $math6 . "<br>";
    echo "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;7. w++ => " . $math7 . "<br>";
    echo "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;8. ++w => " . $math8 . "<br>";

    ?>

    </body>

</html>
