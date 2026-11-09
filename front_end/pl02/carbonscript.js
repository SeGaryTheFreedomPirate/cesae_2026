console.log("Olá Estudantes");
const nome = "Ana Silva";
const idade = 20;
const curso = "Engenharia Informática";
const inscrito = true;
// 1\. Criar nome, idade, curso e inscrito (true/false) [1] // ====================================================== // Usamos 'const' porque os dados do perfil não vão mudar. const nome = "Ana Silva"; const idade = 20; const curso = "Engenharia Informática"; const inscrito = true; // Valor booleano (true ou false)
// ====================================================== // 2\. Apresentar os dados com template literals [1] // ====================================================== // Os template literals usam crases (\`\`) e a sintaxe ${variavel}.

console.log (`Nome: ${nome}`);
console.log(`Idade: ${idade} anos`);
console.log(`Curso: ${curso}`);
console.log(`Inscrito: ${inscrito}`);

// Exemplo numa frase completa:
console.log(`O(A) estudante ${nome}, de ${idade} anos, está no curso de ${curso} (Inscrição ativa: ${inscrito}).`);

// 3\. Criar saldo=100, adicionar 50 e retirar 20 [1]

// Usamos 'let' porque o valor do saldo irá ser modificado.
let saldo = 100;
console.log(`Saldo inicial: ${saldo}`);

// Adicionar 50 ao saldo
saldo += 50;
console.log(`Saldo após adicionar 50: ${saldo}`);

// Retirar 20 do saldo
saldo -= 20;
console.log(`Saldo após retirar 20: ${saldo}`);     

const a =20;
const b = 6; 
console.log("a soma dos numeros é?"+(a + b));
console.log(`A soma dos numeros é: ${a + b}`);

const nota = 16;​



if (nota <0 || nota >20) { console.log(`Nota ${nota}: Valor rejeitado (fora do intervalo 0-20)`) }
else if (nota >= 18) { console.log(`Nota ${nota}: Muito bom`)}
else if (nota >= 14) { console.log(`Nota ${nota}: Bom`)}
else if (nota >= 10) { console.log(`Nota ${nota}: Suficiente`)}
else { console.log(`Nota ${nota}: Não aprovado`) } 

console.log("--- RESULTADOS DOS TESTES ---"); valoresDeTeste.forEach(nota => classificarNota(nota));



for (let i = 0; i < 10; i++) {
    console.log(`Iteração ${i}`);
}   

for (let i = 0; i < 10; i++) {
    console.log(`Iteração ${i}`);
    if (i % 2 === 0) {
        console.log("i é par");
        break;
    }
}   
let soma = 0;
for (let i = 0; i < 10; i++) {
    soma += i;
    console.log(`SOMA ${i}`);
}   
console.log(`A soma total é: ${soma}`);

function ehPar(numero) {
    if (numero % 2 === 0) {
        return true;
    } else {
        return false;
    }}

    function calculardesconto(preco, desconto) {
        const valorDesconto = preco * (desconto / 100);
        const precoFinal = preco - valorDesconto;
        return precoFinal;
    }
