// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/bigtable/v2/bigtable.proto

package com.google.bigtable.v2;

public interface ReadModifyWriteRowRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.bigtable.v2.ReadModifyWriteRowRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The unique name of the table to which the read/modify/write rules should be
   * applied.
   * Values are of the form
   * projects/&amp;lt;project&amp;gt;/instances/&amp;lt;instance&amp;gt;/tables/&amp;lt;table&amp;gt;
   * </pre>
   *
   * <code>optional string table_name = 1;</code>
   */
  java.lang.String getTableName();
  /**
   * <pre>
   * The unique name of the table to which the read/modify/write rules should be
   * applied.
   * Values are of the form
   * projects/&amp;lt;project&amp;gt;/instances/&amp;lt;instance&amp;gt;/tables/&amp;lt;table&amp;gt;
   * </pre>
   *
   * <code>optional string table_name = 1;</code>
   */
  com.google.protobuf.ByteString
      getTableNameBytes();

  /**
   * <pre>
   * The key of the row to which the read/modify/write rules should be applied.
   * </pre>
   *
   * <code>optional bytes row_key = 2;</code>
   */
  com.google.protobuf.ByteString getRowKey();

  /**
   * <pre>
   * Rules specifying how the specified row's contents are to be transformed
   * into writes. Entries are applied in order, meaning that earlier rules will
   * affect the results of later ones.
   * </pre>
   *
   * <code>repeated .google.bigtable.v2.ReadModifyWriteRule rules = 3;</code>
   */
  java.util.List<com.google.bigtable.v2.ReadModifyWriteRule> 
      getRulesList();
  /**
   * <pre>
   * Rules specifying how the specified row's contents are to be transformed
   * into writes. Entries are applied in order, meaning that earlier rules will
   * affect the results of later ones.
   * </pre>
   *
   * <code>repeated .google.bigtable.v2.ReadModifyWriteRule rules = 3;</code>
   */
  com.google.bigtable.v2.ReadModifyWriteRule getRules(int index);
  /**
   * <pre>
   * Rules specifying how the specified row's contents are to be transformed
   * into writes. Entries are applied in order, meaning that earlier rules will
   * affect the results of later ones.
   * </pre>
   *
   * <code>repeated .google.bigtable.v2.ReadModifyWriteRule rules = 3;</code>
   */
  int getRulesCount();
  /**
   * <pre>
   * Rules specifying how the specified row's contents are to be transformed
   * into writes. Entries are applied in order, meaning that earlier rules will
   * affect the results of later ones.
   * </pre>
   *
   * <code>repeated .google.bigtable.v2.ReadModifyWriteRule rules = 3;</code>
   */
  java.util.List<? extends com.google.bigtable.v2.ReadModifyWriteRuleOrBuilder> 
      getRulesOrBuilderList();
  /**
   * <pre>
   * Rules specifying how the specified row's contents are to be transformed
   * into writes. Entries are applied in order, meaning that earlier rules will
   * affect the results of later ones.
   * </pre>
   *
   * <code>repeated .google.bigtable.v2.ReadModifyWriteRule rules = 3;</code>
   */
  com.google.bigtable.v2.ReadModifyWriteRuleOrBuilder getRulesOrBuilder(
      int index);
}
