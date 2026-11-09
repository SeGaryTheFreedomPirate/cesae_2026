const nome = "João";
const notateste = 15;
const notatrabalho = 15;

function calcularMedia(notateste, notatrabalho) {
  return (notateste + notatrabalho) / 2;
}
const media = calcularMedia(notateste, notatrabalho);
console.log(`Estudante: ${nome} | Média: ${media}`);
if (media >= 10) {
  console.log("Aprovado");
} else {
  console.log("Precisa de recuperação");
}


for (let n = 1; n <= 10; n++) {
  console.log(`${Math.floor(media)} x ${n} = ${Math.floor(media) * n}`);
}
