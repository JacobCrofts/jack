package com.rapleaf.jack.store;

import java.util.UUID;

import org.junit.Test;

import com.rapleaf.jack.test_project.database_1.models.TestStore;
import com.rapleaf.jack.test_project.database_1.models.User;

import static org.junit.Assert.assertEquals;

public class TestJsTable {

  private JsTable table;

  @Test
  public void testValidTable() throws Exception {
    table = JsTable.from(TestStore.TBL).create();
    assertEquals(TestStore.TBL.ID.getSqlKeyword(), table.id.getSqlKeyword());
    assertEquals(TestStore.ENTRY_SCOPE.getSqlKeyword(), table.scope.getSqlKeyword());
    assertEquals(TestStore.ENTRY_TYPE.getSqlKeyword(), table.type.getSqlKeyword());
    assertEquals(TestStore.ENTRY_KEY.getSqlKeyword(), table.key.getSqlKeyword());
    assertEquals(TestStore.ENTRY_VALUE.getSqlKeyword(), table.value.getSqlKeyword());

    // switch key and value columns
    table = JsTable.from(TestStore.TBL)
        .setKeyColumn(TestStore.ENTRY_VALUE)
        .setValueColumn(TestStore.ENTRY_KEY)
        .create();
    assertEquals(TestStore.ENTRY_KEY.getSqlKeyword(), table.value.getSqlKeyword());
    assertEquals(TestStore.ENTRY_VALUE.getSqlKeyword(), table.key.getSqlKeyword());
  }

  @Test(expected = IllegalArgumentException.class)
  public void testInvalidTable() throws Exception {
    table = JsTable.from(User.TBL).create();
  }

  @Test(expected = IllegalArgumentException.class)
  public void testInvalidColumn() throws Exception {
    table = JsTable.from(TestStore.TBL)
        .setScopeColumn(User.NUM_POSTS.as(Long.class))
        .create();
  }

  @Test
  public void testTableAlias() throws Exception {
    String alias = UUID.randomUUID().toString();
    table = JsTable.from(TestStore.TBL).create();
    JsTable aliasTable = table.as(alias);
    assertEquals(table.table.getName(), aliasTable.table.getName());
    assertEquals(alias, aliasTable.table.getAlias());
    assertEquals(alias, aliasTable.id.getTable());
    assertEquals(alias, aliasTable.scope.getTable());
    assertEquals(alias, aliasTable.type.getTable());
    assertEquals(alias, aliasTable.key.getTable());
    assertEquals(alias, aliasTable.value.getTable());
  }

  @Test
  public void testEquals() throws Exception {
    JsTable table1 = JsTable.from(TestStore.TBL).create();
    JsTable table2 = JsTable.from(TestStore.TBL).create();
    assertEquals(table1, table1);
    assertEquals(table1, table2);
    assertEquals(table1.hashCode(), table2.hashCode());

    table1 = JsTable.from(TestStore.TBL).setKeyColumn(TestStore.ENTRY_KEY).create();
    table2 = JsTable.from(TestStore.TBL).setTypeColumn(TestStore.ENTRY_TYPE).create();
    assertEquals(table1, table1);
    assertEquals(table1, table2);
    assertEquals(table1.hashCode(), table2.hashCode());
  }

}
