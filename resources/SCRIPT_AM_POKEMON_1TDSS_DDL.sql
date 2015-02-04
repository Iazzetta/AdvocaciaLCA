drop table T_AM_PO_PESSOA cascade constraints;
drop table T_AM_PO_CLIENTE cascade constraints;
drop table T_AM_PO_PROCESSO cascade constraints;
drop table T_AM_PO_HIST_PROC_TX cascade constraints;
drop table T_AM_PO_HIST_TAXA_MORA cascade constraints;
drop table T_AM_PO_LANCA_HONORARIO cascade constraints;
drop table T_AM_PO_TIPO_TAREFA cascade constraints;
drop table T_AM_PO_FORUM cascade constraints;
drop table T_AM_PO_LANCA_DESPESA cascade constraints;
drop table T_AM_PO_TIPO_DESPESA cascade constraints;
drop table T_AM_PO_TIPO_LOG cascade constraints;
drop table T_AM_PO_LOGRADOURO cascade constraints;
drop table T_AM_PO_BAIRRO cascade constraints;
drop table T_AM_PO_CIDADE cascade constraints;
drop table T_AM_PO_ESTADO cascade constraints;
drop table T_AM_PO_FONE_PESSOA cascade constraints;
drop table T_AM_PO_HORA_ADVOGADO cascade constraints;
drop table T_AM_PO_TIPO_CAUSA cascade constraints;
drop table T_AM_PO_PESSOA_ENDE cascade constraints;
drop table T_AM_PO_TELEFONE cascade constraints;
drop table T_AM_PO_TIPO_FONE cascade constraints;
drop table T_AM_PO_ADVOGADO cascade constraints;
drop table T_AM_PO_ESPECIALIDADE cascade constraints;


/*
Criação de tabelas
*/

create table T_AM_PO_PESSOA(
cd_pessoa number(8) not null,
nm_pessoa varchar2(60)not null
);

create table T_AM_PO_CLIENTE (
cd_pessoa number(8) not null,
ds_razao_social varchar2(128) not null, 
nr_cnpj number (15) not null,
nr_insc_estadual number (15) null,
ds_email varchar2 (128) not null,
ds_password varchar2(40) null
);

create table T_AM_PO_PROCESSO(
nr_processo NUMBER(10) not null,
cd_pessoa number(8) not null,
cd_pessoa1 number(8) not null,
cd_causa number (5) not null,
cd_pessoa2 number(8) not null,
ds_processo VARCHAR2(40) null,
dt_abertura DATE not null,
dt_fechamento DATE  null,
dt_dia_vencimento number(2) not null,
nr_resultado NUMBER(1) null,
nr_situacao NUMBER(1) not null,
ds_observacao VARCHAR2 (256) null

);

create table T_AM_PO_HIST_PROC_TX(
nr_processo number(10) not null,
cd_taxa number (4) not null,
dt_validade date  not null
);

create table T_AM_PO_HIST_TAXA_MORA(
cd_taxa NUMBER (4)  not null,
dt_vigencia DATE  not null,
vl_taxa_adm NUMBER (8,2)  not null,
vl_taxa_juros NUMBER (5,2)  not null,
vl_mora_diaria NUMBER (4,2)  not null
);

create table T_AM_PO_LANCA_HONORARIO(
cd_lancamento NUMBER(10)  not null,
cd_tipo_tarefa NUMBER(3)  not null,
nr_processo NUMBER(10)  not null,
cd_advogado NUMBER(8) not null,
dt_honorario DATE not null,
qt_hora NUMBER (8,2)  not null,
ds_observacao VARCHAR2(256) null
);

create table T_AM_PO_TIPO_TAREFA(
cd_tipo_tarefa number(3) not null,
ds_tipo_tarefa varchar2 (256) not null
);

create table T_AM_PO_FORUM(
cd_pessoa number(8) not null,
ds_forum varchar2(256) null
);

create table T_AM_PO_LANCA_DESPESA(
nr_processo NUMBER(10) not null,
cd_lancamento NUMBER (10)  not null,
cd_tipo_despesa NUMBER (5)  not null,
dt_despesa DATE not null,
vl_despesa NUMBER (8,2)  not null,
ds_observacao VARCHAR2 (256)  null
);

create table T_AM_PO_TIPO_DESPESA(
cd_tipo_despesa NUMBER (5)  not null,
ds_tipo_despesa VARCHAR2 (256)  not null
);

create table T_AM_PO_TIPO_LOG(
cd_tipo_log NUMBER (2)  not null,
ds_tipo_log VARCHAR2 (20) not null
);

create table T_AM_PO_LOGRADOURO(
nr_cep NUMBER (8)  not null,
ds_logradouro VARCHAR2 (60)  not null,
cd_bairro NUMBER (6) not null,
cd_tipo_log NUMBER(2) not null
);

create table T_AM_PO_BAIRRO(
cd_bairro NUMBER (6)  not null,
cd_cidade NUMBER(4) not null,
nm_bairro VARCHAR2 (30)  not null
);

create table T_AM_PO_CIDADE(
cd_cidade NUMBER (4) not null,
cd_estado NUMBER(4) not null,
nm_cidade VARCHAR2 (30) not null
);

create table T_AM_PO_ESTADO(
cd_estado NUMBER (2)  not null,
nm_estado VARCHAR2 (20)  not null,
sg_estado CHAR (2)  not null
);

create table T_AM_PO_FONE_PESSOA(
cd_pessoa number (8) not null,
cd_fone number(8) not null,
nr_ramal NUMBER (4) null
);

create table T_AM_PO_HORA_ADVOGADO(
cd_pessoa number(8) not null,
cd_hist_hora NUMBER (4)  not null,
dt_vigencia DATE  not null,
vl_hora NUMBER (8,2) not null
);

create table T_AM_PO_ESPECIALIDADE(
cd_pessoa number (8) not null,
cd_causa number(5) not null
);

create table T_AM_PO_TIPO_CAUSA(
cd_causa NUMBER (8) not null,
ds_causa VARCHAR2 (40) not null
);

create table T_AM_PO_PESSOA_ENDE(
cd_pessoa_ende number(10) not null,
nr_cep number(8) not null,
cd_pessoa number(8) not null,
nr_endereco number(5) not null,
ds_complemento varchar2(20)null
);

create table T_AM_PO_TELEFONE(
cd_fone number (8) not null,
cd_tipo_fone number (8) not null,
nr_ddd number(3) not null,
nr_fone number(9) not null
);


create table T_AM_PO_TIPO_FONE(
cd_tipo_fone number (2) not null,
ds_tipo_fone varchar2(20) not null
);

create table T_AM_PO_ADVOGADO(
cd_pessoa number(8) not null,
nr_oab number(8) not null,
nr_cpf number (11) not null,
nr_rg char(10) not null, 
ds_email varchar2(128) not null,
ds_password varchar2(40) null
);

/*
primary keys
*/

alter table T_AM_PO_PESSOA
add constraint PK_AM_PO_PESSOA primary key (cd_pessoa);

alter table T_AM_PO_LANCA_HONORARIO
add constraint PK_AM_PO_LANCA_HONORARIO primary key (cd_lancamento);

alter table T_AM_PO_LANCA_DESPESA
add constraint PK_AM_PO_LANCA_DESPESA primary key (cd_lancamento);

alter table T_AM_PO_TIPO_DESPESA
add constraint PK_AM_PO_TIPO_DESPESA primary key (cd_tipo_despesa);

alter table T_AM_PO_TIPO_TAREFA
add constraint PK_AM_PO_TIPO_TAREFA primary key (cd_tipo_tarefa);

alter table T_AM_PO_HIST_TAXA_MORA
add constraint PK_AM_PO_HIST_TAXA_MORA primary key (cd_taxa);

alter table T_AM_PO_PROCESSO
add constraint PK_AM_PO_PROCESSO primary key (nr_processo);

alter table T_AM_PO_TIPO_CAUSA
add constraint PK_AM_PO_TIPO_CAUSA primary key (cd_causa);

alter table T_AM_PO_HORA_ADVOGADO
add constraint PK_AM_PO_HORA_ADVOGADO primary key ( cd_pessoa, cd_hist_hora);

alter table T_AM_PO_TIPO_FONE
add constraint PK_AM_PO_TIPO_FONE primary key (cd_tipo_fone);

alter table T_AM_PO_TELEFONE
add constraint PK_AM_PO_TELEFONE primary key (cd_fone);

alter table T_AM_PO_PESSOA_ENDE
add constraint PK_AM_PO_PESSOA_ENDE primary key (cd_pessoa_ende , nr_cep);

alter table T_AM_PO_ESTADO
add constraint PK_AM_PO_ESTADO primary key (cd_estado);

alter table T_AM_PO_CIDADE
add constraint PK_AM_PO_CIDADE primary key (cd_cidade);

alter table T_AM_PO_BAIRRO
add constraint PK_AM_PO_BAIRRO primary key (cd_bairro);

alter table T_AM_PO_LOGRADOURO
add constraint PK_AM_PO_LOGRADOURO primary key (nr_cep);

alter table T_AM_PO_TIPO_LOG
add constraint PK_AM_PO_TIPO_LOG primary key (cd_tipo_log);

alter table T_AM_PO_HIST_PROC_TX
add constraint PK_AM_PO_HIST_PROC_TX primary key ( nr_processo , cd_taxa );

alter table T_AM_PO_ESPECIALIDADE
add constraint PK_AM_PO_ESPECIALIDADE primary key ( cd_pessoa , cd_causa );

alter table T_AM_PO_ADVOGADO
add constraint PK_AM_PO_ADVOGADO primary key (cd_pessoa );

alter table T_AM_PO_FORUM
add constraint PK_AM_PO_FORUM primary key ( cd_pessoa );

alter table T_AM_PO_CLIENTE
add constraint PK_AM_PO_CLIENTE primary key ( cd_pessoa );

/*
Uniques
*/

ALTER TABLE T_AM_PO_ADVOGADO 
    ADD CONSTRAINT UN_AM_PO_ADVOGADO_OAB UNIQUE ( nr_oab ) ;

ALTER TABLE T_AM_PO_ADVOGADO 
    ADD CONSTRAINT UN_AM_PO_ADVOGADO_CPF UNIQUE ( nr_cpf ) ;

ALTER TABLE T_AM_PO_ADVOGADO 
    ADD CONSTRAINT UN_AM_PO_ADVOGADO_RG UNIQUE ( nr_rg ) ;

ALTER TABLE T_AM_PO_TIPO_FONE 
    ADD CONSTRAINT UN_AM_PO_TIPO_FONE UNIQUE ( ds_tipo_fone ) ;

ALTER TABLE T_AM_PO_TIPO_CAUSA 
    ADD CONSTRAINT UN_AM_PO_TIPO_CAUSA UNIQUE ( ds_causa ) ;

ALTER TABLE T_AM_PO_ESTADO
    ADD CONSTRAINT UN_AM_PO_ESTADO UNIQUE ( nm_estado ) ;

ALTER TABLE T_AM_PO_ESTADO
    ADD CONSTRAINT UN_AM_PO_SIGLA_ESTADO UNIQUE ( sg_estado ) ;

ALTER TABLE T_AM_PO_TIPO_LOG
    ADD CONSTRAINT UN_AM_PO_TIPO_LOG  UNIQUE  (ds_tipo_log );

ALTER TABLE T_AM_PO_TIPO_DESPESA
    ADD CONSTRAINT UN_AM_PO_TIPO_DESPESA  UNIQUE  ( ds_tipo_despesa ) ;

ALTER TABLE T_AM_PO_TIPO_TAREFA
    ADD CONSTRAINT UN_AM_PO_TIPO_TAREFA  UNIQUE  ( ds_tipo_tarefa ) ;

ALTER TABLE T_AM_PO_CLIENTE
    ADD CONSTRAINT UN_AM_PO_CLIENTE_RAZAO  UNIQUE  ( ds_razao_social ) ;

ALTER TABLE T_AM_PO_CLIENTE
    ADD CONSTRAINT UN_AM_PO_CLIENTE_CNPJ  UNIQUE  ( nr_cnpj ) ;
    
/*
FKS
*/
    
ALTER TABLE T_AM_PO_LANCA_DESPESA 
    ADD CONSTRAINT FK_AM_PO_TIPO_DESP FOREIGN KEY 
    ( 
     cd_tipo_despesa
    ) 
    REFERENCES T_AM_PO_TIPO_DESPESA 
    ( 
     cd_tipo_despesa
    );

ALTER TABLE T_AM_PO_LANCA_DESPESA 
    ADD CONSTRAINT FK_AM_PO_PROC_DESP FOREIGN KEY 
    ( 
     nr_processo
    ) 
    REFERENCES T_AM_PO_PROCESSO 
    ( 
     nr_processo
    );

ALTER TABLE T_AM_PO_FORUM 
    ADD CONSTRAINT FK_AM_PO_FORUM FOREIGN KEY 
    ( 
     cd_pessoa
    ) 
    REFERENCES T_AM_PO_PESSOA 
    ( 
     cd_pessoa
    );

ALTER TABLE T_AM_PO_PROCESSO 
    ADD CONSTRAINT FK_AM_PO_PROCESSO_CLIENTE FOREIGN KEY 
    ( 
     cd_pessoa
    ) 
    REFERENCES T_AM_PO_CLIENTE 
    ( 
     cd_pessoa
    );

ALTER TABLE T_AM_PO_PROCESSO 
    ADD CONSTRAINT FK_PO_PROCESSO_ADVOGADO FOREIGN KEY 
    ( 
     cd_pessoa1
    ) 
    REFERENCES T_AM_PO_ADVOGADO
    ( 
     cd_pessoa
    );
    
ALTER TABLE T_AM_PO_PROCESSO 
    ADD CONSTRAINT FK_AM_PO_PROCESSO_FORUM FOREIGN KEY 
    ( 
     cd_pessoa2
    ) 
    REFERENCES T_AM_PO_FORUM
    ( 
     cd_pessoa
    );



ALTER TABLE T_AM_PO_HIST_PROC_TX 
    ADD CONSTRAINT FK_AM_PO_PROC_TX FOREIGN KEY 
    ( 
     nr_processo
    ) 
    REFERENCES T_AM_PO_PROCESSO
    ( 
     nr_processo
    );


ALTER TABLE T_AM_PO_HIST_PROC_TX 
    ADD CONSTRAINT FK_AM_PO_HIST_TAXA FOREIGN KEY 
    ( 
     cd_taxa
    ) 
    REFERENCES T_AM_PO_HIST_TAXA_MORA
    ( 
     cd_taxa
    );

ALTER TABLE T_AM_PO_LANCA_HONORARIO 
    ADD CONSTRAINT FK_AM_PO_LANCA_HONORARIO FOREIGN KEY 
    ( 
     cd_tipo_tarefa
    ) 
    REFERENCES T_AM_PO_TIPO_TAREFA
    ( 
     cd_tipo_tarefa
    );

ALTER TABLE T_AM_PO_LANCA_HONORARIO 
    ADD CONSTRAINT FK_AM_PO_PROC_HONO FOREIGN KEY 
    ( 
     nr_processo
    ) 
    REFERENCES T_AM_PO_PROCESSO
    ( 
     nr_processo
    );

ALTER TABLE T_AM_PO_LANCA_HONORARIO 
    ADD CONSTRAINT FK_AM_PO_HONO_ADV FOREIGN KEY 
    ( 
     cd_advogado
    ) 
    REFERENCES T_AM_PO_ADVOGADO
    ( 
     cd_PESSOA
    );

ALTER TABLE T_AM_PO_CLIENTE 
    ADD CONSTRAINT FK_AM_PO_CLIENTE FOREIGN KEY 
    ( 
     cd_pessoa
    ) 
    REFERENCES T_AM_PO_PESSOA
    ( 
     cd_pessoa
    );


ALTER TABLE T_AM_PO_ESPECIALIDADE
    ADD CONSTRAINT FK_AM_PO_ESPEC_CAUSA FOREIGN KEY 
    ( 
     cd_causa
    ) 
    REFERENCES T_AM_PO_TIPO_CAUSA
    ( 
     cd_causa
    );

ALTER TABLE T_AM_PO_ESPECIALIDADE
    ADD CONSTRAINT FK_AM_PO_ESPEC_ADVOGADO FOREIGN KEY 
    ( 
     cd_pessoa
    ) 
    REFERENCES T_AM_PO_ADVOGADO
    ( 
     cd_pessoa
    );
    
ALTER TABLE T_AM_PO_HORA_ADVOGADO
    ADD CONSTRAINT FK_AM_PO_HORA_ADVOGADO FOREIGN KEY 
    ( 
     cd_pessoa
    ) 
    REFERENCES T_AM_PO_PESSOA
    ( 
     cd_pessoa
    );

ALTER TABLE T_AM_PO_FONE_PESSOA
    ADD CONSTRAINT FK_AM_PO_FONE_PESSOA FOREIGN KEY 
    ( 
     cd_pessoa
    ) 
    REFERENCES T_AM_PO_PESSOA
    ( 
     cd_pessoa
    );
    
ALTER TABLE T_AM_PO_PESSOA_ENDE
    ADD CONSTRAINT FK_AM_PO_PESSOA_ENDE FOREIGN KEY 
    ( 
     cd_pessoa
    ) 
    REFERENCES T_AM_PO_PESSOA
    ( 
     cd_pessoa
    );

ALTER TABLE T_AM_PO_FONE_PESSOA
    ADD CONSTRAINT FK_AM_PO_FONE FOREIGN KEY 
    ( 
     cd_fone
    ) 
    REFERENCES T_AM_PO_TELEFONE
    ( 
     cd_fone
    );

ALTER TABLE T_AM_PO_PESSOA_ENDE
    ADD CONSTRAINT FK_AM_PO_LOGRADOURO FOREIGN KEY 
    ( 
     nr_cep
    ) 
    REFERENCES T_AM_PO_LOGRADOURO
    ( 
     nr_cep
    );
    
ALTER TABLE T_AM_PO_LOGRADOURO
    ADD CONSTRAINT FK_AM_PO_BAIRROLOG FOREIGN KEY 
    ( 
     cd_bairro
    ) 
    REFERENCES T_AM_PO_BAIRRO
    ( 
     cd_bairro
    );
    
ALTER TABLE T_AM_PO_LOGRADOURO
    ADD CONSTRAINT FK_AM_PO_TIPOLOG FOREIGN KEY 
    ( 
     cd_tipo_log
    ) 
    REFERENCES T_AM_PO_TIPO_LOG
    ( 
     cd_tipo_log
    );

ALTER TABLE T_AM_PO_CIDADE
    ADD CONSTRAINT FK_AM_PO_ESTADO FOREIGN KEY 
    ( 
     cd_estado
    ) 
    REFERENCES T_AM_PO_ESTADO
    ( 
     cd_estado
    );


ALTER TABLE T_AM_PO_BAIRRO
    ADD CONSTRAINT FK_AM_PO_CIDADE FOREIGN KEY 
    ( 
     cd_cidade
    ) 
    REFERENCES T_AM_PO_CIDADE
    ( 
     cd_cidade
    );

ALTER TABLE T_AM_PO_TELEFONE
    ADD CONSTRAINT FK_AM_PO_TIPO_FONE FOREIGN KEY 
    ( 
     cd_tipo_fone
    ) 
    REFERENCES T_AM_PO_TIPO_FONE
    ( 
     cd_tipo_fone
    );

/*
checks
*/
alter table T_AM_PO_HIST_TAXA_MORA
add constraint CK_AM_PO_HIST_TAXA_ADM CHECK (vl_taxa_adm > 0);

alter table T_AM_PO_HIST_TAXA_MORA
add constraint CK_AM_PO_HIST_TAXA_JUROS CHECK (vl_taxa_juros > 0);

alter table T_AM_PO_HIST_TAXA_MORA
add constraint CK_AM_PO_HIST_TAXA_MORA CHECK (vl_mora_diaria > 0);

alter table T_AM_PO_HORA_ADVOGADO
add constraint CK_AM_PO_HORA_ADVOGADO CHECK (vl_hora > 0);

alter table T_AM_PO_LANCA_DESPESA
add constraint CK_AM_PO_LANCA_DESPESA CHECK (vl_despesa > 0);

alter table T_AM_PO_LANCA_HONORARIO
add constraint CK_AM_PO_LANCA_HONORAIO CHECK (qt_hora > 0);

alter table T_AM_PO_PROCESSO
add constraint CK_AM_PO_PROCESSO_DATA CHECK (dt_fechamento > dt_abertura);

alter table T_AM_PO_PROCESSO
add constraint CK_AM_PO_PROCESSO_DIA CHECK (dt_dia_vencimento between 01 and 30);

alter table T_AM_PO_PROCESSO
add constraint CK_AM_PO_PROCESSO_RESULT CHECK (nr_resultado =1 or nr_resultado =2);

alter table T_AM_PO_PROCESSO
add constraint CK_AM_PO_PROCESSO_SITUACAO CHECK (nr_situacao =1 or nr_situacao =2);

/*
modificar
*/

ALTER TABLE T_AM_PO_PROCESSO MODIFY ds_processo varchar2(60) not null;

--DDL

DROP SEQUENCE SQ_AM_PO_ESTADO;
DROP SEQUENCE SQ_AM_PO_CIDADE;
DROP SEQUENCE SQ_AM_PO_BAIRRO;
DROP SEQUENCE SQ_AM_PO_TIPO_LOG;
DROP SEQUENCE SQ_AM_PO_TIPO_FONE;
DROP SEQUENCE SQ_AM_PO_TELEFONE;
DROP SEQUENCE SQ_AM_PO_PESSOA;
DROP SEQUENCE SQ_AM_PO_PESSOA_ENDE;
DROP SEQUENCE SQ_AM_PO_TIPO_CAUSA;
DROP SEQUENCE SQ_AM_PO_TIPO_DESPESA;
DROP SEQUENCE SQ_AM_PO_TIPO_TAREFA;
DROP SEQUENCE SQ_AM_PO_LANCA_HONORARIO;
DROP SEQUENCE SQ_AM_PO_HIST_TAXA;
DROP SEQUENCE SQ_AM_PO_PROCESSO;
DROP SEQUENCE SQ_AM_PO_LANCA_DESPESA;

CREATE SEQUENCE SQ_AM_PO_ESTADO
INCREMENT BY 1
START WITH 1
MAXVALUE 9999
NOCACHE
NOCYCLE;
--

CREATE SEQUENCE SQ_AM_PO_CIDADE
INCREMENT BY 1
START WITH 1
MAXVALUE 9999
NOCACHE
NOCYCLE;
--

CREATE SEQUENCE SQ_AM_PO_BAIRRO
INCREMENT BY 1
START WITH 1
MAXVALUE 9999
NOCACHE
NOCYCLE;
--

CREATE SEQUENCE SQ_AM_PO_TIPO_LOG
INCREMENT BY 1
START WITH 1
MAXVALUE 9999
NOCACHE
NOCYCLE;
--

CREATE SEQUENCE SQ_AM_PO_TIPO_FONE
INCREMENT BY 1
START WITH 1
MAXVALUE 9999
NOCACHE
NOCYCLE;
--

CREATE SEQUENCE SQ_AM_PO_TELEFONE
INCREMENT BY 1
START WITH 1
MAXVALUE 9999
NOCACHE
NOCYCLE;
--

CREATE SEQUENCE SQ_AM_PO_PESSOA
INCREMENT BY 1
START WITH 1
MAXVALUE 9999
NOCACHE
NOCYCLE;
--

CREATE SEQUENCE SQ_AM_PO_PESSOA_ENDE
INCREMENT BY 1
START WITH 1
MAXVALUE 9999
NOCACHE
NOCYCLE;
--

CREATE SEQUENCE SQ_AM_PO_TIPO_CAUSA
INCREMENT BY 1
START WITH 1
MAXVALUE 9999
NOCACHE
NOCYCLE;
--

CREATE SEQUENCE SQ_AM_PO_TIPO_DESPESA
INCREMENT BY 1
START WITH 1
MAXVALUE 9999
NOCACHE
NOCYCLE;
--

CREATE SEQUENCE SQ_AM_PO_TIPO_TAREFA
INCREMENT BY 1
START WITH 1
MAXVALUE 9999
NOCACHE
NOCYCLE;
--

CREATE SEQUENCE SQ_AM_PO_LANCA_HONORARIO
INCREMENT BY 1
START WITH 1
MAXVALUE 9999
NOCACHE
NOCYCLE;
--

CREATE SEQUENCE SQ_AM_PO_HIST_TAXA
INCREMENT BY 1
START WITH 1
MAXVALUE 9999
NOCACHE
NOCYCLE;
--

CREATE SEQUENCE SQ_AM_PO_PROCESSO
INCREMENT BY 1
START WITH 1
MAXVALUE 9999
NOCACHE
NOCYCLE;
--

CREATE SEQUENCE SQ_AM_PO_LANCA_DESPESA
INCREMENT BY 1
START WITH 1
MAXVALUE 9999
NOCACHE
NOCYCLE;
--


-- RENAMES DAS COLUNAS DE CD_PESSOA
/*
nomes alterar
*/

ALTER TABLE T_AM_PO_CLIENTE
RENAME COLUMN CD_PESSOA TO CD_CLIENTE;

ALTER TABLE T_AM_PO_FORUM
RENAME COLUMN CD_PESSOA TO CD_FORUM;

ALTER TABLE T_AM_PO_ADVOGADO
RENAME COLUMN CD_PESSOA TO CD_ADVOGADO;

ALTER TABLE  T_AM_PO_ESPECIALIDADE
RENAME COLUMN CD_PESSOA TO CD_ADVOGADO;

ALTER TABLE  T_AM_PO_HORA_ADVOGADO
RENAME COLUMN CD_PESSOA TO CD_ADVOGADO;

ALTER TABLE T_AM_PO_PROCESSO
RENAME COLUMN CD_PESSOA TO CD_CLIENTE;

ALTER TABLE T_AM_PO_PROCESSO
RENAME COLUMN CD_PESSOA1 TO CD_ADVOGADO;

ALTER TABLE T_AM_PO_PROCESSO
RENAME COLUMN CD_PESSOA2 TO CD_FORUM;