let btn = document.querySelector('input');
let cit = document.querySelector('p');
let pict = document.querySelector('img');
let titre = document.querySelector('h1')
const lien = "http://graven.yt/citations.json";
let citations = [];


btn.addEventListener('click', generateCit);

fetch(lien).then((data) => {
    data.json().then((data) => {
        citations = data;
    })
})

function generateCit() {

    let random = Math.floor(Math.random()* (citations.length) - 0);
    let randomCit = citations[random];

    titre.textContent = randomCit['nom'];
    cit.textContent = randomCit['citation'];
    pict.src = randomCit['image'];
}