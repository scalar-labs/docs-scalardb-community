# ScalarDB 3.5 Release Notes

This page includes a list of release notes for ScalarDB 3.5.

## v3.5.9

**Release date:** June 30, 2023

### Summary

This release has several small improvements and vulnerability fixes.

### Change logs

#### Improvements

- Improve some `toString` expressions of Selection Operators ([#920](https://github.com/scalar-labs/scalardb/pull/920))

#### Bug fixes

- Bump scalar-labs/jre8 from 1.1.12 to 1.1.13 in /server ([#881](https://github.com/scalar-labs/scalardb/pull/881))
- Bump scalar-labs/jre8 from 1.1.12 to 1.1.13 in /schema-loader ([#882](https://github.com/scalar-labs/scalardb/pull/882))
- Bump scalar-labs/jre8 from 1.1.13 to 1.1.14 in /schema-loader ([#903](https://github.com/scalar-labs/scalardb/pull/903))
- Bump scalar-labs/jre8 from 1.1.13 to 1.1.14 in /server ([#902](https://github.com/scalar-labs/scalardb/pull/902))

#### Documentation

- Change HTML syntax to Markdown for images (3.5) ([#875](https://github.com/scalar-labs/scalardb/pull/875))

## v3.5.8

**Release date:** April 28, 2023

### Summary

This release has several vulnerability fixes.

### Change logs

#### Bug fixes

- Fix CVE-2022-42898 ([#794](https://github.com/scalar-labs/scalardb/pull/794))
- Fix [CVE-2023-0286](https://github.com/advisories/GHSA-x4qr-2fvf-3mr5 "CVE-2023-0286") ([#821](https://github.com/scalar-labs/scalardb/pull/821))
- Fix [CVE-2023-0361](https://github.com/advisories/GHSA-5547-g9w2-52xj "CVE-2023-0361") and [CVE-2022-41723](https://github.com/advisories/GHSA-vvpx-j8f3-3w6h "CVE-2022-41723") ([#834](https://github.com/scalar-labs/scalardb/pull/834))
- Fix [CVE-2022-41721](https://github.com/advisories/GHSA-fxg5-wq6x-vr4w "CVE-2022-41721") ([#808](https://github.com/scalar-labs/scalardb/pull/808))

## v3.5.7

**Release date:** December 27, 2022

### Summary

This release has several bug fixes.

### Change logs

#### Bug fixes

- Upgrade docker image version to fix [CVE-2021-46848](https://github.com/advisories/GHSA-6468-68pw-9chw "CVE-2021-46848") ([#766](https://github.com/scalar-labs/scalardb/pull/766))
- Fix [CVE-2022-21363](https://github.com/advisories/GHSA-g76j-4cxx-23h9 "CVE-2022-21363") and [CVE-2021-2471](https://github.com/advisories/GHSA-w6f2-8wx4-47r5 "CVE-2021-2471") ([#773](https://github.com/scalar-labs/scalardb/pull/773))
- Fix [CVE-2022-41946](https://github.com/advisories/GHSA-562r-vg33-8x8h "CVE-2022-41946") ([#774](https://github.com/scalar-labs/scalardb/pull/774))

## v3.5.6

**Release date:** December 1, 2022

### Summary

This release has several bug fixes.

### Change logs

#### Bug fixes

- Update protobuf and grpc to fix [CVE-2022-3171](https://github.com/advisories/GHSA-h4h5-3hr4-j3g2 "CVE-2022-3171") ([#738](https://github.com/scalar-labs/scalardb/pull/738))
- Fix [CVE-2022-40151](https://github.com/advisories/GHSA-f8cc-g7j8-xxpm "CVE-2022-40151") and [CVE-2022-40152](https://github.com/advisories/GHSA-3f7h-mf4q-vrm4 "CVE-2022-40152") ([#743](https://github.com/scalar-labs/scalardb/pull/743))

## v3.5.5

**Release date:** November 16, 2022

### Summary

This release has several bug fixes.

### Change logs

#### Bug fixes

- Fix [CVE-2021-3999](https://github.com/advisories/GHSA-vfch-2fr8-r5c2 "CVE-2021-3999"), [CVE-2022-1586](https://github.com/advisories/GHSA-f3pv-9fwh-mp3x "CVE-2022-1586") and [CVE-2022-1587](https://github.com/advisories/GHSA-jmvm-hj36-w5hc "CVE-2022-1587") ([#700](https://github.com/scalar-labs/scalardb/pull/700))
- Fix [CVE-2022-27664](https://github.com/advisories/GHSA-69cg-p879-7622 "CVE-2022-27664") ([#716](https://github.com/scalar-labs/scalardb/pull/716))
- Fix [CVE-2022-32149](https://github.com/advisories/GHSA-69ch-w2m2-3vjp "CVE-2022-32149") ([#727](https://github.com/scalar-labs/scalardb/pull/727))
- Fix [CVE-2022-42003](https://github.com/advisories/GHSA-jjjh-jjxp-wpff "CVE-2022-42003") and [CVE-2022-42004](https://github.com/advisories/GHSA-rgv9-q543-rqg4 "CVE-2022-42004") ([#726](https://github.com/scalar-labs/scalardb/pull/726))
- Fix dependency errors for Maven projects ([#735](https://github.com/scalar-labs/scalardb/pull/735))
- Fix typos in exception messages ([#714](https://github.com/scalar-labs/scalardb/pull/714))

## v3.5.4

**Release date:** September 2, 2022

### Summary

This release has several bug fixes.

### Change logs

#### Bug fixes

- Fix [CVE-2022-31197](https://github.com/advisories/GHSA-r38f-c4h4-hqq2 "CVE-2022-31197") affecting PostgreSQL driver ([#650](https://github.com/scalar-labs/scalardb/pull/650))
- Fix [CVE-2021-46828](https://github.com/advisories/GHSA-x62c-6mxr-74fh "CVE-2021-46828") by bumping the jre8 dependency version ([#653](https://github.com/scalar-labs/scalardb/pull/653))
- Fix [CVE-2022-2509](https://github.com/advisories/GHSA-w33j-4mrg-pgc3 "CVE-2022-2509") ([#654](https://github.com/scalar-labs/scalardb/pull/654))
- Fix [CVE-2022-37434](https://github.com/advisories/GHSA-cfmr-vrgj-vqwv "CVE-2022-37434") ([#677](https://github.com/scalar-labs/scalardb/pull/677))

## v3.5.3

**Release date:** July 8, 2022

### Improvements

- Update jre8 base image to 1.1.2 ([#587](https://github.com/scalar-labs/scalardb/pull/587))
- Update dependencies to fix [CVE-2022-25647](https://github.com/advisories/GHSA-4jrv-ppp4-jm57 "CVE-2022-25647") ([#589](https://github.com/scalar-labs/scalardb/pull/589))
- Fix [CVE-2022-1664](https://github.com/advisories/GHSA-q7pv-fjh6-6xq6 "CVE-2022-1664") ([#604](https://github.com/scalar-labs/scalardb/pull/604))
- Fix [CVE-2022-2068](https://github.com/advisories/GHSA-xjxr-x4h8-946x "CVE-2022-2068") ([#623](https://github.com/scalar-labs/scalardb/pull/623))

## v3.5.2

**Release date:** April 28, 2022

### Enhancements

- Release SNAPSHOT versions ([#561](https://github.com/scalar-labs/scalardb/pull/561))

### Improvements

- Fix typo in the integrationTestTwoPhaseConsensusCommit gradle task name ([#546](https://github.com/scalar-labs/scalardb/pull/546))
- Update the base image jre8 to 1.1.0 ([#551](https://github.com/scalar-labs/scalardb/pull/551))
- Migrate CI to GitHub actions ([#541](https://github.com/scalar-labs/scalardb/pull/541))
- Trigger CI for "push" event on the master branch ([#557](https://github.com/scalar-labs/scalardb/pull/557))
- Update the base image jre8 to 1.1.1 ([#560](https://github.com/scalar-labs/scalardb/pull/560))
- Add docker check to CI ([#568](https://github.com/scalar-labs/scalardb/pull/568))
- Add CI triggers for "push" events on support and release branches ([#572](https://github.com/scalar-labs/scalardb/pull/572))

### Bug fixes

- Fix `Query condition missed key schema element` error in DynamoDB ([#544](https://github.com/scalar-labs/scalardb/pull/544))
- Fix SQL syntax error that happens when scanning a table without clustering key in JDBC adapter ([#550](https://github.com/scalar-labs/scalardb/pull/550))
- Upgrade grpc_health_probe ([#562](https://github.com/scalar-labs/scalardb/pull/562))
- Upgrade PostgreSQL driver ([#563](https://github.com/scalar-labs/scalardb/pull/563))
- Upgrade Cosmos DB client ([#564](https://github.com/scalar-labs/scalardb/pull/564))

### Documentation

- Update CI status badge in index.md ([#556](https://github.com/scalar-labs/scalardb/pull/556))

## v3.5.1

**Release date:** March 28, 2022

### Bug fixes

- Handle lastEvaluatedKey for query in DynamoDB ([#534](https://github.com/scalar-labs/scalardb/pull/534))
- Should return primary key when key is contained in WriteSet and ReadSet but the result in ReadSet is empty in Consensus Commit ([#535](https://github.com/scalar-labs/scalardb/pull/535))

## v3.5.0

**Release date:** February 16, 2022 

### Enhancements

- Make JDBC isolation level configurable ([#412](https://github.com/scalar-labs/scalardb/pull/412))
- Support parallel preparation/commit/rollback in Consensus Commit ([#438](https://github.com/scalar-labs/scalardb/pull/438))
- Support async commit/rollback in Consensus Commit ([#445](https://github.com/scalar-labs/scalardb/pull/445))
- Add connection pool configurations for JdbcAdmin ([#458](https://github.com/scalar-labs/scalardb/pull/458))
- Add TransactionalTableMetadataManager ([#465](https://github.com/scalar-labs/scalardb/pull/465))
- Support parallel validation for EXTRA_READ in Consensus Commit ([#459](https://github.com/scalar-labs/scalardb/pull/459))
- Add ByteBuffer support for Blob type ([#497](https://github.com/scalar-labs/scalardb/pull/497))
- Add ByteBuffer support to Value ([#508](https://github.com/scalar-labs/scalardb/pull/508))

### Improvements

- Refactor DistributedStorageAdmin ([#405](https://github.com/scalar-labs/scalardb/pull/405))
- Move ReadRepairableExecutionException to the Cassandra package ([#411](https://github.com/scalar-labs/scalardb/pull/411))
- Throw RetriableExecutionException when TransactionConflict happens in the Dynamo adapter ([#407](https://github.com/scalar-labs/scalardb/pull/407))
- Throw RetriableExecutionException in mutate operations when conflicts happen in the JDBC adapter ([#408](https://github.com/scalar-labs/scalardb/pull/408))
- Handle RetriableExecutionException in ConsensusCommit ([#409](https://github.com/scalar-labs/scalardb/pull/409))
- Move Isolation to the consensuscommit package ([#404](https://github.com/scalar-labs/scalardb/pull/404))
- Result.getClusteringKey() should return empty when there is no clustering key ([#410](https://github.com/scalar-labs/scalardb/pull/410))
- Use the internal JRE Docker image to avoid CVE fixing commands ([#420](https://github.com/scalar-labs/scalardb/pull/420))
- Revisit logging in Consensus Commit ([#419](https://github.com/scalar-labs/scalardb/pull/419))
- Remove synchronized from ConsensusCommitManager ([#418](https://github.com/scalar-labs/scalardb/pull/418))
- Upgrade supported storage database version in the CI ([#416](https://github.com/scalar-labs/scalardb/pull/416))
- Refactor OperationChecker ([#423](https://github.com/scalar-labs/scalardb/pull/423))
- Add `SCALAR_DB_SERVER_PORT` to database.properties.tmpl ([#426](https://github.com/scalar-labs/scalardb/pull/426))
- Rename utility classes for consistency ([#425](https://github.com/scalar-labs/scalardb/pull/425))
- Upgrade log4j version ([#429](https://github.com/scalar-labs/scalardb/pull/429))
- Filter transactional columns and support projection for get/scan in Consensus Commit ([#428](https://github.com/scalar-labs/scalardb/pull/428))
- Use different datasource for table metadata in JDBC adapter ([#431](https://github.com/scalar-labs/scalardb/pull/431))
- Remove TransactionRuntimeException ([#430](https://github.com/scalar-labs/scalardb/pull/430))
- Move CoordinatorException to the consensuscommit package ([#434](https://github.com/scalar-labs/scalardb/pull/434))
- Upgrade log4j to 2.17.0 ([#436](https://github.com/scalar-labs/scalardb/pull/436))
- Add end-to-end test for schema loader to CI ([#349](https://github.com/scalar-labs/scalardb/pull/349))
- Refactor integration tests ([#442](https://github.com/scalar-labs/scalardb/pull/442))
- Upgrade log4j to 2.17.1 ([#449](https://github.com/scalar-labs/scalardb/pull/449))
- Refactor Schema Loader ([#448](https://github.com/scalar-labs/scalardb/pull/448))
- Rename JdbcDatabaseAdmin to JdbcAdmin ([#456](https://github.com/scalar-labs/scalardb/pull/456))
- Deprecate XXXService classes ([#455](https://github.com/scalar-labs/scalardb/pull/455))
- Refactor TableMetadataManager ([#454](https://github.com/scalar-labs/scalardb/pull/454))
- Refactor JDBC adapter ([#468](https://github.com/scalar-labs/scalardb/pull/468))
- Sort order for Scan without orderings should follow clustering order in Cosmos adapter ([#473](https://github.com/scalar-labs/scalardb/pull/473))
- Allow getting already written data in Consensus Commit ([#474](https://github.com/scalar-labs/scalardb/pull/474))
- Rename JDBC integration tests ([#475](https://github.com/scalar-labs/scalardb/pull/475))
- Handle SQL Server conflict error ([#478](https://github.com/scalar-labs/scalardb/pull/478))
- Add more integration tests for Scan ([#477](https://github.com/scalar-labs/scalardb/pull/477))
- Increase no_output_timeout for Cosmos DB adapter CI ([#483](https://github.com/scalar-labs/scalardb/pull/483))
- Use only id and version to check if a read record is not changed in the validation in EXTRA_READ ([#482](https://github.com/scalar-labs/scalardb/pull/482))
- Add annotations ([#491](https://github.com/scalar-labs/scalardb/pull/491))
- Move ResultImpl to the util package ([#492](https://github.com/scalar-labs/scalardb/pull/492))
- Unnecessary columns are not read any more in Consensus Commit ([#488](https://github.com/scalar-labs/scalardb/pull/488))
- Add constructors to ConditionalExpression ([#496](https://github.com/scalar-labs/scalardb/pull/496))
- Use before image column names from TransactionalTableMetadata in RollbackMutationComposer ([#494](https://github.com/scalar-labs/scalardb/pull/494))
- Revisit Key construction ([#447](https://github.com/scalar-labs/scalardb/pull/447))
- Should not change states of operation instances passed as arguments ([#498](https://github.com/scalar-labs/scalardb/pull/498))
- Classes/Methods deprecated in 3.x should be removed in 5.0.0 ([#506](https://github.com/scalar-labs/scalardb/pull/506))
- Reduce Intellij warnings ([#503](https://github.com/scalar-labs/scalardb/pull/503))
- Change Key builder ([#504](https://github.com/scalar-labs/scalardb/pull/504))
- Move the rollbackRecords method from RecoveryHandler to CommitHandler ([#500](https://github.com/scalar-labs/scalardb/pull/500))
- Revisit logging ([#502](https://github.com/scalar-labs/scalardb/pull/502))
- Refactor Scalar DB Server code ([#453](https://github.com/scalar-labs/scalardb/pull/453))
- Add ConfigUtils.getStringArray() ([#501](https://github.com/scalar-labs/scalardb/pull/501))
- Rename `keyspace` to `namespace` in unit tests ([#507](https://github.com/scalar-labs/scalardb/pull/507))

### Bug fixes

- Add mergeServiceFiles for shadowJar in Schema Loader ([#406](https://github.com/scalar-labs/scalardb/pull/406))
- Fix get tables in Dynamo adapter when actual number of tables exceed the maximum in a response. ([#415](https://github.com/scalar-labs/scalardb/pull/415))
- Restore JdbcUtils.initDataSource(JdbcConfig config) ([#417](https://github.com/scalar-labs/scalardb/pull/417))
- Log in GitHub Container Registry first ([#421](https://github.com/scalar-labs/scalardb/pull/421))
- Add -u option for Cosmos DB in schema loader for backward compatibility ([#440](https://github.com/scalar-labs/scalardb/pull/440))
- Should close FileInputStream in XXXConfig ([#451](https://github.com/scalar-labs/scalardb/pull/451))
- Should rollback a transaction when expiring it in Two-phase commit transactions ([#452](https://github.com/scalar-labs/scalardb/pull/452))
- Transactions that have multiple scans are always rejected in EXTRA_READ ([#457](https://github.com/scalar-labs/scalardb/pull/457))
- Handling namespaces/tables/columns with reserved keywords in Cassandra and JDBC adapters ([#441](https://github.com/scalar-labs/scalardb/pull/441))
- Handling namespaces/tables/columns with reserved keywords in DynamoDB adapter ([#462](https://github.com/scalar-labs/scalardb/pull/462))
- Handling namespaces/tables/columns with reserved keywords in Cosmos DB adapter ([#461](https://github.com/scalar-labs/scalardb/pull/461))
- Fix OperationChecker for mutation operations ([#476](https://github.com/scalar-labs/scalardb/pull/476))
- Fix Scan logic in CrudHandler in Consensus Commit ([#479](https://github.com/scalar-labs/scalardb/pull/479))
- Should not publish a fat jar for Schema Loader to the maven repository ([#490](https://github.com/scalar-labs/scalardb/pull/490))
- Update PostgreSQL driver version for vulnerability fix ([#493](https://github.com/scalar-labs/scalardb/pull/493))

### Documentation

- Update the Scalar DB version in README ([#403](https://github.com/scalar-labs/scalardb/pull/403))
- Update schema-loader javadoc to fix warning ([#413](https://github.com/scalar-labs/scalardb/pull/413))
- Update the Scalar DB version of the dependency in README ([#433](https://github.com/scalar-labs/scalardb/pull/433))
- Improve Getting Started with Scalar DB on X ([#432](https://github.com/scalar-labs/scalardb/pull/432))
- Add gRPC deadline duration configuration to the Scalar DB Server documentation ([#437](https://github.com/scalar-labs/scalardb/pull/437))
- Update the Getting Started doc and code ([#446](https://github.com/scalar-labs/scalardb/pull/446))
- Add A Guide on How to Handle Exceptions ([#450](https://github.com/scalar-labs/scalardb/pull/450))
- Update Scalar DB backup and restoration guide ([#486](https://github.com/scalar-labs/scalardb/pull/486))
- Support SQL Server and Amazon Aurora officially ([#499](https://github.com/scalar-labs/scalardb/pull/499))
- Update the Scalar DB version of the dependency in README ([#509](https://github.com/scalar-labs/scalardb/pull/509))
