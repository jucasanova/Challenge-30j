<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Bric’arts brac</title>
</head>
<body>
    <h1>Bric’arts brac</h1>
    <p>Bienvenue sur le site Bric’arts brac, vous pourrez ici mettre en vente vos oeuvres d’arts de toute époque et
        recevrez instantanément une estimation du prix de rachat</p>

    <form method="post" action="estimation.php">
        <div>
            <input type="text" name="nom" id="nom" placeholder="Nom de l'oeuvre" required>
            <select name="type" id="type">
                <option value="5">Dessin</option>
                <option value="27">Sculpture</option>
                <option value="35">Peinture</option>
                <option value="1205">Doc historique</option>
                <option value="0">Autre</option>
            </select>
            <select name="annee" id="annee">
                <option value="100000">Avant 1200</option>
                <option value="76000">Entre 1201 et 1600</option>
                <option value="32000">Entre 1601 et 1800</option>
                <option value="15000">Entre 1801 et 1999</option>
                <option value="0">Après 2000</option>
            </select>
            <button id="boutton">Lancer estimation</button>
        </div>
    </form>


</body>
</html>
</html>