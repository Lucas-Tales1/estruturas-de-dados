# Questão 1

Descreva o estado da fila (inicialmente vazia) após cada uma das operações a seguir:
enqueue(5), enqueue(3), dequeue(), enqueue(2), enqueue(8), dequeue(), dequeue(),
enqueue(9), enqueue(1), dequeue(), enqueue(7), enqueue(6), dequeue(), dequeue(),
enqueue(4), enqueue (7), dequeue().

##

## resposta

5 // enqueue(5)
5, 3 // enqueue(3)
3 // dequeue()
3, 2 // enqueue(2)
3, 2, 8 // enqueue(8)
2, 8 // dequeue()
8 // dequeue()
8, 9 // enqueue(9)
8, 9, 1 // enqueue(1)
9, 1 // dequeue()
9, 1, 7 // enqueue(7)
9, 1, 7, 6 // enqueue(6)
1, 7, 6 // dequeue()
7, 6 // dequeue()
7, 6, 4 // enqueue(4)
7, 6, 4, 7 // enqueue(7)
6, 4, 7 // dequeue()