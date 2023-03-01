package br.com.ebook;

import br.com.ebook.Conta;
import java.math.BigDecimal;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-03-01T15:31:15", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Conta.class)
public class Conta_ { 

    public static volatile SingularAttribute<Conta, Conta> conta;
    public static volatile SingularAttribute<Conta, Long> id;
    public static volatile SingularAttribute<Conta, BigDecimal> saldo;

}