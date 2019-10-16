package com.speedment.example.domainmodel.sakila.sakila.sakila.inventory.generated;

import com.speedment.common.annotation.GeneratedCode;
import com.speedment.example.domainmodel.sakila.sakila.sakila.inventory.Inventory;
import com.speedment.example.domainmodel.sakila.sakila.sakila.inventory.InventoryManager;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.speedment.runtime.core.manager.AbstractManager;
import com.speedment.runtime.field.Field;

import java.util.stream.Stream;

/**
 * The generated base implementation for the manager of every {@link
 * com.speedment.example.domainmodel.sakila.sakila.sakila.inventory.Inventory}
 * entity.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedInventoryManagerImpl 
extends AbstractManager<Inventory> 
implements GeneratedInventoryManager {
    
    private final TableIdentifier<Inventory> tableIdentifier;
    
    protected GeneratedInventoryManagerImpl() {
        this.tableIdentifier = TableIdentifier.of("sakila", "sakila", "inventory");
    }
    
    @Override
    public TableIdentifier<Inventory> getTableIdentifier() {
        return tableIdentifier;
    }
    
    @Override
    public Stream<Field<Inventory>> fields() {
        return InventoryManager.FIELDS.stream();
    }
    
    @Override
    public Stream<Field<Inventory>> primaryKeyFields() {
        return Stream.of(
            Inventory.INVENTORY_ID
        );
    }
}