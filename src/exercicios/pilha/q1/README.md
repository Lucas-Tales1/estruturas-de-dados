# Questão 1

Descreva o estado da pilha (inicialmente vazia) após cada uma das operações a seguir (Esta questão é a mesma
da R-4.1 do livro).
push(5), push(3), pop(), push(2), push(8), pop(), pop(), push(9), push(1), pop(), push(7), push(6), pop(), pop(),
push(4), pop(), pop().

##

## resposta
    5 // push(5)
    5, 3 // push(3)
    5 // pop()
    5, 2 // push(2)
    5, 2, 8 // push(8)
    5, 2 // pop()
    5 // pop()
    5, 9 // push(9)
    5, 9, 1 // push(1)
    5, 9 // pop()
    5, 9, 7 // push(7)
    5, 8, 7, 6 // push(6)
    5, 9, 7 // pop()
    5, 9 // pop()
    5, 9, 4 // push(4)
    5, 9 // pop()
    5 // pop <------------------------------