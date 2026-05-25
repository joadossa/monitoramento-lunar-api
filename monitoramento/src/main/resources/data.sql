MERGE INTO SENSOR (
    ID, NOME, TIPO, UNIDADE_MEDIDA, VALOR_ATUAL, LOCALIZACAO, STATUS
) KEY (ID) VALUES
(1, 'Sensor de Oxigênio', 'Oxigênio', '%', 21.5, 'Módulo Habitacional A', 'NORMAL'),
(2, 'Sensor de Temperatura', 'Temperatura', '°C', 24.8, 'Laboratório Lunar', 'NORMAL'),
(3, 'Sensor de Radiação', 'Radiação', 'mSv', 0.8, 'Área Externa', 'ATENÇÃO');


MERGE INTO RESERVATORIO (
    ID, NOME, TIPO_RECURSO, CAPACIDADE_MAXIMA, QUANTIDADE_ATUAL, UNIDADE_MEDIDA, STATUS
) KEY (ID) VALUES
(1, 'Reservatório de Água Principal', 'Água', 10000, 7200, 'litros', 'OPERACIONAL'),
(2, 'Reservatório de Oxigênio', 'Oxigênio', 5000, 3900, 'litros', 'OPERACIONAL'),
(3, 'Reservatório de Combustível', 'Combustível', 3000, 1200, 'litros', 'ATENÇÃO');


MERGE INTO CONSUMO_ENERGIA (
    ID, SETOR, CONSUMO_ATUAL, LIMITE_CONSUMO, UNIDADE_MEDIDA, STATUS
) KEY (ID) VALUES
(1, 'Laboratório Lunar', 450.5, 800.0, 'kWh', 'NORMAL'),
(2, 'Módulo Habitacional A', 620.0, 900.0, 'kWh', 'NORMAL'),
(3, 'Sistema de Comunicação', 920.0, 850.0, 'kWh', 'ALERTA');


MERGE INTO CLIMATIZACAO (
    ID, SETOR, TEMPERATURA_ATUAL, UMIDADE_ATUAL, NIVEL_OXIGENIO, STATUS
) KEY (ID) VALUES
(1, 'Estufa Experimental', 24.8, 55.0, 20.9, 'ESTÁVEL'),
(2, 'Módulo Habitacional A', 22.5, 48.0, 21.0, 'ESTÁVEL'),
(3, 'Laboratório Lunar', 31.5, 40.0, 19.2, 'ALERTA');


MERGE INTO ALERTA_OPERACIONAL (
    ID, TITULO, DESCRICAO, NIVEL_CRITICIDADE, SETOR, STATUS
) KEY (ID) VALUES
(1, 'Baixo nível de água', 'Reservatório principal abaixo de 30%', 'MÉDIO', 'Recursos Hídricos', 'ABERTO'),
(2, 'Consumo elevado de energia', 'Sistema de comunicação ultrapassou o limite de consumo', 'ALTO', 'Energia', 'EM ANÁLISE'),
(3, 'Temperatura elevada', 'Laboratório Lunar acima da temperatura recomendada', 'ALTO', 'Climatização', 'ABERTO');