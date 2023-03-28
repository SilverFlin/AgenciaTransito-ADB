# Modelo Relacional
Personas (
curp: texto(18),
rfc: entero,
nombre: texto(50),
apellidoPaterno: texto(50), 
apellidoMaterno: texto(50),
fechaNacimiento: fecha,
telefono: texto(20)
);

Trámites (
idTramite: entero,
costo: decimal,
rfcPersona: entero
);
rfcPersona pertenece a Personas

Licencias (
idLicencia: entero,
añosVigencia: entero,
tipo: texto(”normal”,”discapacitados”),
fechaInicio: fecha,
fechaCaducidad: fecha,
idTramite: entero
);
idTramite pertenece a Trámites

Placas (
idPlaca: entero,
matrícula: texto(18),
estado: texto(”activo”,”desactivado”),
            tipo: texto(”nuevo”,”usado”),
fechaEmision: fecha,
fechaRecepcion: fecha,
idTramite: entero
);
idTramite pertenece a Trámites

Vehículos (
numSerie: entero,
linea: texto(50),
marca: texto(50),
modelo: texto(50),
color: texto(50),
rfcPersona: entero
);
rfcPersona pertenece a Personas

Automóviles (
idAutomovil: entero,
numSerie: entero
);
numSerie pertenece a Vehículos
