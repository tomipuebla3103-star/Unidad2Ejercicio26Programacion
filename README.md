<img width="409" height="306" alt="image" src="https://github.com/user-attachments/assets/33869ab1-71ed-4d23-8162-a4baaab18fd9" />

Controladores de Impresión y Periféricos

Descripción
Este proyecto consiste en un sistema en Java que permite simular la impresión de documentos utilizando diferentes tipos de impresoras. Todas comparten una operación de impresión, pero cada una tiene sus propias características y controla sus consumibles de manera diferente.

 Clases
- **Impresor:** clase abstracta que contiene los atributos comunes `modelo` y `resolucion`, y define el método abstracto `imprimirDocumento(String documento)`.
- **ImpresoraLaser:** representa una impresora láser y controla el nivel de tóner disponible antes de imprimir.
- **ImpresoraTinta:** representa una impresora de chorro de tinta y verifica el nivel de tinta del cartucho antes de imprimir.

Funcionamiento
En el `main` se crean una impresora láser y una impresora de tinta con sus respectivos modelos, resoluciones y niveles de consumibles. Luego, se intenta imprimir documentos con ambos dispositivos. Finalmente, se muestran por consola los resultados de las impresiones y el estado de cada impresora.

Recorrido del mensaje
1. El programa crea las impresoras con sus características y consumibles iniciales.
2. Se solicita la impresión de un documento mediante el método `imprimirDocumento()`.
3. Cada impresora verifica si tiene suficiente tóner o tinta para realizar la impresión.
4. Si tiene consumibles disponibles, imprime el documento y actualiza su estado.
5. Si los consumibles están agotados, rechaza la impresión e informa el motivo.
6. Finalmente, se muestran por consola los resultados y los niveles de consumibles restantes.

Validaciones
El sistema debe comprobar que el documento no esté vacío y que los consumibles tengan disponibilidad. Si el tóner o la tinta están agotados, la impresora no debe realizar la operación.

Objetivo
Practicar el uso de clases abstractas, la herencia, la sobrescritura de métodos y la validación de condiciones para representar diferentes dispositivos mediante una estructura común.
