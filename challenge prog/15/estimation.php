<?php

echo "<h3>Estimation en cours...</h3>"."<br/>";



if (!empty($_POST['nom']) && !empty($_POST['type']) && !empty($_POST['annee'])) {
    $nom = $_POST['nom'];
    $type = $_POST['type'];
    $annee = $_POST['annee'];

    echo "L'oeuvre : ".$nom."<br/>";

    $prixTotal = $annee * ( 1 + ($type / 100));

    echo "est estimée à : ".$prixTotal."<br/>"."Détail : ".$annee."€ + ".$type."%<br/>";

    if (($nom == "Gravenicasso") && ($annee == "15000")) {

        echo '<img src="http://graven.yt/gravenicasso.jpg" alt="" width="500px">'."<br/>";

    }

}
else {
    echo "Veuillez renseigner tous les champs !";
}

