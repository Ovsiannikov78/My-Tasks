/*
* Given some text
Отец мой Андрей Петрович Гринев в молодости своей служил при графе Минихе и вышел в отставку премьер-майором в 17.. году.
* С тех пор жил он в своей Симбирской деревне, где и женился на девице Авдотье Васильевне Ю., дочери бедного тамошнего дворянина.
* Нас было девять человек детей. Все мои братья и сестры умерли во младенчестве.

write function returning the object containing the frequency of use words in the text, e.g.:
{
"мой": 2,
"Отец": 1,
"в": 5
}
* */

// create an empty Object
const frequencyDictionary = {};

const text = "Отец мой Андрей Петрович Гринев в молодости своей служил при графе Минихе и вышел в отставку премьер-майором в 17.. году. " +
    "С тех пор жил он в своей Симбирской деревне, где и женился на девице Авдотье Васильевне Ю., дочери бедного тамошнего дворянина." +
    "Нас было девять человек детей. Все мои братья и сестры умерли во младенчестве."

// create an array of words from string
let words = text.split(/[ ,.;:-]+/).filter(function (el) {
    return el.length !== 0
});

// fill fill the object with key-value pairs.
// Where the key is a word from string array
// and the value is the quantity  of its frequency in the text.
function getWordsToTheObject(text) {
    for (let i = 0; i < words.length; i++) {
        let word = words[i];
        frequencyDictionary[word] = (frequencyDictionary[word] || 0) + 1;
    }
    return frequencyDictionary;
}

console.log( getWordsToTheObject(text));
