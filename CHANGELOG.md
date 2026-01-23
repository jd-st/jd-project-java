# Changelog

## 0.5.1 (2026-01-23)

Full Changelog: [v0.5.0...v0.5.1](https://github.com/jd-st/jd-project-java/compare/v0.5.0...v0.5.1)

### Bug Fixes

* **client:** preserve time zone in lenient date-time parsing ([f1d7109](https://github.com/jd-st/jd-project-java/commit/f1d7109e8c4d4252904d64b002a896a1de439131))
* **tests:** add missing query/header params ([4f40e73](https://github.com/jd-st/jd-project-java/commit/4f40e7368f5639221e85af92f7d359f55485a101))


### Chores

* **internal:** correct cache invalidation for `SKIP_MOCK_TESTS` ([309b895](https://github.com/jd-st/jd-project-java/commit/309b8954b28153f2c921bab191614f497d9873e6))

## 0.5.0 (2026-01-22)

Full Changelog: [v0.4.0...v0.5.0](https://github.com/jd-st/jd-project-java/compare/v0.4.0...v0.5.0)

### Features

* **client:** send `X-Stainless-Kotlin-Version` header ([4287841](https://github.com/jd-st/jd-project-java/commit/4287841c71d815e3a5c0122827cb4165b856da56))


### Chores

* **internal:** update maven repo doc to include authentication ([e574f43](https://github.com/jd-st/jd-project-java/commit/e574f43e557a98518eb2a6ad2de0c028e5d7ebe7))

## 0.4.0 (2026-01-20)

Full Changelog: [v0.3.0...v0.4.0](https://github.com/jd-st/jd-project-java/compare/v0.3.0...v0.4.0)

### Features

* **api:** api update ([4bb68a1](https://github.com/jd-st/jd-project-java/commit/4bb68a12916910158b68138f143efc42f6e3844e))

## 0.3.0 (2026-01-20)

Full Changelog: [v0.2.1...v0.3.0](https://github.com/jd-st/jd-project-java/compare/v0.2.1...v0.3.0)

### Features

* **api:** manual updates ([b28f477](https://github.com/jd-st/jd-project-java/commit/b28f47717c156db9c000b6062e6defa53ec76655))


### Chores

* **ci:** upgrade `actions/setup-java` ([48739b3](https://github.com/jd-st/jd-project-java/commit/48739b3e6ac8da2b93f8a46ff7c0a87e0177334a))

## 0.2.1 (2026-01-17)

Full Changelog: [v0.2.0...v0.2.1](https://github.com/jd-st/jd-project-java/compare/v0.2.0...v0.2.1)

### Bug Fixes

* **client:** disallow coercion from float to int ([0ae39c6](https://github.com/jd-st/jd-project-java/commit/0ae39c6861b0a082347edca22a0ed2d11e3ad4a5))
* **client:** fully respect max retries ([2171c32](https://github.com/jd-st/jd-project-java/commit/2171c32e7ddd51ee5cc108ac42e219e61e94f095))
* **client:** send retry count header for max retries 0 ([2171c32](https://github.com/jd-st/jd-project-java/commit/2171c32e7ddd51ee5cc108ac42e219e61e94f095))
* date time deserialization leniency ([b285086](https://github.com/jd-st/jd-project-java/commit/b285086b39d58f33df361d131b8ce575c37940a7))


### Chores

* **internal:** depend on packages directly in example ([2171c32](https://github.com/jd-st/jd-project-java/commit/2171c32e7ddd51ee5cc108ac42e219e61e94f095))
* **internal:** improve maven repo docs ([ffc686e](https://github.com/jd-st/jd-project-java/commit/ffc686e416b3eb4bab8ebd0c9d85660aacbc3723))
* **internal:** update `actions/checkout` version ([f20fc7c](https://github.com/jd-st/jd-project-java/commit/f20fc7cd694fe2fe660a99208c8c28ad178c0800))
* test on Jackson 2.14.0 to avoid encountering FasterXML/jackson-databind[#3240](https://github.com/jd-st/jd-project-java/issues/3240) in tests ([b285086](https://github.com/jd-st/jd-project-java/commit/b285086b39d58f33df361d131b8ce575c37940a7))

## 0.2.0 (2026-01-16)

Full Changelog: [v0.1.0...v0.2.0](https://github.com/jd-st/jd-project-java/compare/v0.1.0...v0.2.0)

### Features

* **client:** allow configuring dispatcher executor service ([aaabfd6](https://github.com/jd-st/jd-project-java/commit/aaabfd68b61990d7d5ecfdbd9f90e16b3c3965f7))


### Chores

* **internal:** clean up maven repo artifact script and add html documentation to repo root ([6e3b409](https://github.com/jd-st/jd-project-java/commit/6e3b40953b96f397e6881d4f9c01918c7ff6debe))
* **internal:** support uploading Maven repo artifacts to stainless package server ([65b3d32](https://github.com/jd-st/jd-project-java/commit/65b3d327c585566c3325211117798763bd440b46))

## 0.1.0 (2026-01-06)

Full Changelog: [v0.0.2...v0.1.0](https://github.com/jd-st/jd-project-java/compare/v0.0.2...v0.1.0)

### Features

* **api:** manual updates ([19f16bb](https://github.com/jd-st/jd-project-java/commit/19f16bb27e754f41cd310a0a86908b59c51499aa))

## 0.0.2 (2026-01-06)

Full Changelog: [v0.0.1...v0.0.2](https://github.com/jd-st/jd-project-java/compare/v0.0.1...v0.0.2)

### Chores

* configure new SDK language ([efb15c6](https://github.com/jd-st/jd-project-java/commit/efb15c651724c0a597902cf57a28498f3307259d))
* update SDK settings ([494582d](https://github.com/jd-st/jd-project-java/commit/494582d9d6da3e3c36ced6dbc01d4bc6385d4ea5))
