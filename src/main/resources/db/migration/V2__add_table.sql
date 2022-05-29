ALTER TABLE public.cotacao_materiais ADD mat_unidade varchar NULL;
ALTER TABLE public.cotacao_materiais ADD mat_codigo varchar NULL;

ALTER TABLE public.pedido ADD ped_data date NULL;

ALTER TABLE public.pedido ADD ped_fornecedor varchar NULL;

CREATE TABLE public.contato (
	cont_id serial NOT NULL,
	cont_telefone varchar NULL,
	cont_email varchar NULL,
	cons_id integer NOT NULL,
	CONSTRAINT contato_pk PRIMARY KEY (cont_id),
	CONSTRAINT contato_fk FOREIGN KEY (cons_id) REFERENCES public.construtora(cons_id)
);
