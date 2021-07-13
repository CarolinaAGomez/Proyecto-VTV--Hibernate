# Proyecto-VTV--Hibernate  realizado en la facultad en donde el proyecto es el siguiente:


La Verificación Técnica Vehicular es el control obligatorio periódico del estado mecánico y de emisión de
gases contaminantes de los automotores.
Existen dos tipos de dueños de vehículo: “común” o “exento”, un exento no abona el valor de la
inspección.
Para poder establecer que un vehículo finalizó una inspección de la VTV con el estado aprobatorio (apto)
se tienen en cuenta dos tipos de controles: basados en observaciones y basados en mediciones. Las
observaciones son el primer paso de una inspección y se relacionan con aquello que un inspector de la VTV
puede analizar visualmente: se revisan las luces, patente, espejos, chasis, vidrios y seguridad y emergencia del
vehículo. Las mediciones son determinadas por la maquinaria que evalúa el sistema de frenos, suspensión,
dirección y tren delantero; sistema de frenos y contaminación ambiental.
Una vez que se obtienen todos los datos se determina si un vehículo está: “apto” (si tiene observaciones y
mediciones aptas), “condicional” (si tiene por lo menos una observación o medición condicional) o “rechazado” (si
tiene por lo menos una observación o medición rechazada).
Un vehículo apto tiene una oblea con validez de un año, uno condicional no puede recibir la oblea pero
puede volver en el transcurso del día de la inspección con el arreglo en la parte desfavorable de esta para poder
hacer la VTV nuevamente sin volver a pagar, uno rechazado no recibe oblea y tiene que volver a pagar para poder
hacer la inspección.

Casos de uso:
1) + traerContribuyente (int idPersona) : Contribuyente
2) + traerInspector (int idPersona) : Inspector
3) + traerAutomotor (String dominio) : Automotor
4) + traerInspeccion (int idInspeccion) : Inspeccion
5) + traerInspeccion (Automotor automotor) : Inspeccion
6) + traerInspeccion (LocalDate fecha) : Inspeccion
7) + traerInspeccion (Inspector inspector, LocalDate fecha) : Inspeccion
8) + traerInspeccion (LocalDate fecha, String estado) : Inspeccion

TEST
1) + traerContribuyente (2) : Contribuyente
2) + traerInspector (1) : Inspector
3) + traerAutomotor (LLL444) : Automotor
4) + traerInspeccion (1) : Inspeccion
5) + traerInspeccion (Automotor [idAutomotor=5, dominio=LLL444, modelo=2012,
marca=Honda]) : Inspeccion
6) + traerInspeccion (11/2/2021) : Inspeccion
7) + traerInspeccion (Inspector [idPersona=1, apellido=Perez, nombres=Juan, dni=11111111,
legajo=100] ,11/2/2021) : Inspeccion
8) + traerInspeccion (13/2/2021 , apto) : Inspeccion
