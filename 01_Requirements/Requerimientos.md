# Requerimientos generales del sistema

- [ ] Manejo de más tipos de:
  - [ ] Vehículos
  - [ ] Más requerimientos para los trámites
- [ ] Crear licencia necesita requisitos previos:
  - RFC
  - Nombre Completo
  - Fecha Nacimiento
  - Teléfono
- [ ] Periodo de licencia mínimo 1 año, máximo 3
- [ ] Posibilidad de solicitar varias licencias por persona
  - [ ] Cada licencia le pertenece a una persona
- [ ] Solicitud de licencia a coches nuevos y usados
- [ ] Contenido de Placas
  - [ ] Formato ([A-Z][A-Z][A-Z] - [0-9][0-9][0-9])
  - [ ] Fecha de cambio de placas
- [ ] Por coche, solo puede haber unas placas activas.
  - [ ] Desactivación de placa anterior, si es que la hay
- [ ] Para coches nuevos
  - [ ] No repetido
  - [ ] Guardar
    - [ ] No. Serie
    - [ ] Marca
    - [ ] Línea
    - [ ] Color
    - [ ] Modelo
  - [ ] Licencia Vigente a la hora de creación
- [ ] Para coches usados
  - [ ] Registro previo del coche
  - [ ] No. Placas anteriores (Para buscar el coche ya registrado)
  - [ ] Licencia Vigente
- [ ] Historial de placas del coche
  - [ ] Costos de cada trámite
- [ ] Costo de placas según tipo de coche (Nuevo-Usado)
- [ ] Consultas
  - [ ] Historial de Licencias y Placas por persona
    - [ ] Filtros de Busqueda
      - [ ] CURP
      - [ ] nombres similares de la persona
      - [ ] años de nacimiento
    - [ ] Funcionalidad en dos pasos
    1. Buscar personas que cumplan los criterios
    2. Seleccionar a la persona de la cual se quiera ver historial
- [ ] Reporte de tramites solicitados
  - [ ] Contenido
    - [ ] Fecha de realización del trámite
    - [ ] Tipo de trámite (Expedición de placas/licencia)
    - [ ] Nombre del solicitante
    - [ ] Costo
  - [ ] Busquedas por [^1]
    - [ ] Ceriodo de tiempo
    - [ ] Tipo de trámite
    - [ ] Por nombres similares
   - [ ] Visualización de la información
     - [ ] En el Sistema
     - [ ] Exportar PDF
       - [ ] Incluir
         - [ ] Titulo
         - [ ] Fecha Generación de PDF
         - [ ] No. Pagina
         - [ ] Contenido del reporte



[^1]: ¿Esto va en consultas?