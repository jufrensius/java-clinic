package com.clinic.drug.repository;

import com.clinic.AbstractEntityRepository;
import com.clinic.drug.domain.QtyUnit;

public class QtyUnitRepository extends AbstractEntityRepository<QtyUnit> {
    protected QtyUnitRepository() {
        super(QtyUnit.class);
    }

    @Override
    protected String tableName() {
        return "qty_unit";
    }
}
