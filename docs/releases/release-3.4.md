# ScalarDB 3.4 Release Notes

This page includes a list of release notes for ScalarDB 3.4.

## v3.4.9

**Release date:** December 27, 2022 

### Summary

This release has several bug fixes.

### Change logs

#### Bug fixes

- Upgrade docker image version to fix [CVE-2021-46848](https://github.com/advisories/GHSA-6468-68pw-9chw "CVE-2021-46848") ([#766](https://github.com/scalar-labs/scalardb/pull/766))
- Fix [CVE-2022-21363](https://github.com/advisories/GHSA-g76j-4cxx-23h9 "CVE-2022-21363") and [CVE-2021-2471](https://github.com/advisories/GHSA-w6f2-8wx4-47r5 "CVE-2021-2471") ([#773](https://github.com/scalar-labs/scalardb/pull/773))
- Fix [CVE-2022-41946](https://github.com/advisories/GHSA-562r-vg33-8x8h "CVE-2022-41946") ([#774](https://github.com/scalar-labs/scalardb/pull/774))

## v3.4.8

**Release date:** December 1, 2022 

### Summary

This release has several bug fixes.

### Change logs

#### Bug fixes

- Update protobuf and grpc to fix [CVE-2022-3171](https://github.com/advisories/GHSA-h4h5-3hr4-j3g2 "CVE-2022-3171") ([#738](https://github.com/scalar-labs/scalardb/pull/738))
- Fix [CVE-2022-40151](https://github.com/advisories/GHSA-f8cc-g7j8-xxpm "CVE-2022-40151") and [CVE-2022-40152](https://github.com/advisories/GHSA-3f7h-mf4q-vrm4 "CVE-2022-40152") ([#743](https://github.com/scalar-labs/scalardb/pull/743))

## v3.4.7

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

## v3.4.6

**Release date:** September 2, 2022 

### Summary

This release has several bug fixes.

### Change logs

#### Bug fixes

- Fix [CVE-2022-31197](https://github.com/advisories/GHSA-r38f-c4h4-hqq2 "CVE-2022-31197") affecting PostgreSQL driver ([#650](https://github.com/scalar-labs/scalardb/pull/650))
- Fix [CVE-2021-46828](https://github.com/advisories/GHSA-x62c-6mxr-74fh "CVE-2021-46828") by bumping the jre8 dependency version ([#653](https://github.com/scalar-labs/scalardb/pull/653))
- Fix [CVE-2022-2509](https://github.com/advisories/GHSA-w33j-4mrg-pgc3 "CVE-2022-2509") ([#654](https://github.com/scalar-labs/scalardb/pull/654))
- Fix [CVE-2022-37434](https://github.com/advisories/GHSA-cfmr-vrgj-vqwv "CVE-2022-37434") ([#677](https://github.com/scalar-labs/scalardb/pull/677))

## v3.4.5

**Release date:** July 8, 2022 

### Improvements

- Update jre8 base image to 1.1.2 ([#587](https://github.com/scalar-labs/scalardb/pull/587))
- Update dependencies to fix [CVE-2022-25647](https://github.com/advisories/GHSA-4jrv-ppp4-jm57 "CVE-2022-25647") ([#589](https://github.com/scalar-labs/scalardb/pull/589))
- Fix [CVE-2022-1664](https://github.com/advisories/GHSA-q7pv-fjh6-6xq6 "CVE-2022-1664") ([#604](https://github.com/scalar-labs/scalardb/pull/604))
- Fix [CVE-2022-2068](https://github.com/advisories/GHSA-xjxr-x4h8-946x "CVE-2022-2068") ([#623](https://github.com/scalar-labs/scalardb/pull/623))

## v3.4.4

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

## v3.4.3

**Release date:** March 28, 2022 

### Improvements

- Use the internal JRE Docker image to avoid CVE fixing commands ([#420](https://github.com/scalar-labs/scalardb/pull/420))
- Refactor integration tests ([#442](https://github.com/scalar-labs/scalardb/pull/442))

### Bug fixes

- Log in GitHub Container Registry first ([#421](https://github.com/scalar-labs/scalardb/pull/421))
- Handle lastEvaluatedKey for query in DynamoDB ([#534](https://github.com/scalar-labs/scalardb/pull/534))

## v3.4.2

**Release date:** February 10, 2022 

### Improvements

- Upgrade log4j to 2.17.0 ([#436](https://github.com/scalar-labs/scalardb/pull/436))
- Add end-to-end test for schema loader to CI ([#349](https://github.com/scalar-labs/scalardb/pull/349))
- Upgrade log4j to 2.17.1 ([#449](https://github.com/scalar-labs/scalardb/pull/449))
- Refactor Schema Loader ([#448](https://github.com/scalar-labs/scalardb/pull/448))

### Bug fixes

- Add -u option for Cosmos DB in schema loader for backward compatibility ([#440](https://github.com/scalar-labs/scalardb/pull/440))
- Should close FileInputStream in XXXConfig ([#451](https://github.com/scalar-labs/scalardb/pull/451))
- Should rollback a transaction when expiring it in Two-phase commit transactions ([#452](https://github.com/scalar-labs/scalardb/pull/452))
- Transactions that have multiple scans are always rejected in EXTRA_READ ([#457](https://github.com/scalar-labs/scalardb/pull/457))
- Handling namespaces/tables/columns with reserved keywords in Cassandra and JDBC adapters ([#441](https://github.com/scalar-labs/scalardb/pull/441))
- Handling namespaces/tables/columns with reserved keywords in DynamoDB adapter ([#462](https://github.com/scalar-labs/scalardb/pull/462))
- Handling namespaces/tables/columns with reserved keywords in Cosmos DB adapter ([#461](https://github.com/scalar-labs/scalardb/pull/461))
- Fix OperationChecker for mutation operations ([#476](https://github.com/scalar-labs/scalardb/pull/476))
- Should not publish a fat jar for Schema Loader to the maven repository ([#490](https://github.com/scalar-labs/scalardb/pull/490))
- Update PostgreSQL driver version for vulnerability fix ([#493](https://github.com/scalar-labs/scalardb/pull/493))

## v3.4.1

**Release date:** December 13, 2021 

### Improvements

- Move Isolation to the consensuscommit package ([#404](https://github.com/scalar-labs/scalardb/pull/404))
- Upgrade log4j version ([#429](https://github.com/scalar-labs/scalardb/pull/429))

### Bug fixes

- Add mergeServiceFiles for shadowJar in Schema Loader ([#406](https://github.com/scalar-labs/scalardb/pull/406))
- Fix get tables in Dynamo adapter when actual number of tables exceed the maximum in a response. ([#415](https://github.com/scalar-labs/scalardb/pull/415))

## v3.4.0

**Release date:** December 2, 2021 

### Enhancements

- Add ConsensusCommitUtils ([#367](https://github.com/scalar-labs/scalardb/pull/367))
- Add KeyBytesEncoder that converts a key to bytes while preserving the sort order ([#369](https://github.com/scalar-labs/scalardb/pull/369))
- Add clustering order support to JDBC adapter ([#378](https://github.com/scalar-labs/scalardb/pull/378))
- Add clustering order support to Dynamo adapter ([#385](https://github.com/scalar-labs/scalardb/pull/385))
- Add supporting schema creation/deletion can be called from program ([#366](https://github.com/scalar-labs/scalardb/pull/366))

### Improvements

- Refactor XXXConfig classes ([#372](https://github.com/scalar-labs/scalardb/pull/372))
- Remove UnsupportedTypeException ([#373](https://github.com/scalar-labs/scalardb/pull/373))
- Add null or empty check for partition key and clustering key ([#370](https://github.com/scalar-labs/scalardb/pull/370))
- Allow empty value for partition key and clustering key ([#374](https://github.com/scalar-labs/scalardb/pull/374))
- Add dockerize to Dockerfile for grpc-server ([#376](https://github.com/scalar-labs/scalardb/pull/376))
- Add more tests to the multiple clustering key integration test ([#380](https://github.com/scalar-labs/scalardb/pull/380))
- Refactor CosmosAdmin ([#382](https://github.com/scalar-labs/scalardb/pull/382))
- Disallow empty values for Partition key and Clustering key ([#381](https://github.com/scalar-labs/scalardb/pull/381))
- DynamoDB sort key optimization ([#375](https://github.com/scalar-labs/scalardb/pull/375))
- Add single clustering key scan integration test ([#386](https://github.com/scalar-labs/scalardb/pull/386))
- Add column value integration test ([#387](https://github.com/scalar-labs/scalardb/pull/387))
- Add secondary index integration test ([#389](https://github.com/scalar-labs/scalardb/pull/389))
- Add partition key integration tests ([#388](https://github.com/scalar-labs/scalardb/pull/388))
- Add syntax highlighting for the dependency in README.md ([#384](https://github.com/scalar-labs/scalardb/pull/384))
- Run integration tests concurrently ([#390](https://github.com/scalar-labs/scalardb/pull/390))
- Introduce prometheus simpleclient_hotspot ([#391](https://github.com/scalar-labs/scalardb/pull/391))
- Add integration tests for clustering order ([#393](https://github.com/scalar-labs/scalardb/pull/393))
- Reduce integration test concurrency ([#397](https://github.com/scalar-labs/scalardb/pull/397))
- Add some more admin integration tests ([#394](https://github.com/scalar-labs/scalardb/pull/394))
- Modify Dockerfile to run as non-root ([#395](https://github.com/scalar-labs/scalardb/pull/395))
- Add -XX:MaxRAMPercentage parameter to SCALARDB_SERVER_OPTS ([#392](https://github.com/scalar-labs/scalardb/pull/392))
- Improve KeyBytesEncoderTest ([#379](https://github.com/scalar-labs/scalardb/pull/379))
- Reduce Intellij warnings ([#400](https://github.com/scalar-labs/scalardb/pull/400))
- Adjust integration test concurrency ([#399](https://github.com/scalar-labs/scalardb/pull/399))
- Small fix for release.yaml ([#402](https://github.com/scalar-labs/scalardb/pull/402))

### Bug fixes

- Fix hashCode() in XXXValue and Key classes ([#377](https://github.com/scalar-labs/scalardb/pull/377))
- Should show the warning message only when specifying storage specific options ([#396](https://github.com/scalar-labs/scalardb/pull/396))
- Should add a suffix to the metadata table name in DynamoWithReservedKeywordIntegrationTest ([#401](https://github.com/scalar-labs/scalardb/pull/401))

### Documentation

- Improve Multi-storage documentation ([#365](https://github.com/scalar-labs/scalardb/pull/365))
- Improve Schema loader document ([#368](https://github.com/scalar-labs/scalardb/pull/368))
