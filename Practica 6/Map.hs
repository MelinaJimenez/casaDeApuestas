module Map
    (Map, emptyM, assocM, lookupM, deleteM, keys) 
  where

data Map k v = M [(k,v)]
  {- INV.REP.: en M kvs, no hay claves repetidas en kvs -}

--COSTO:O(1), devuelve una lista de clave-valor
--Propósito: devuelve un map vacío
emptyM :: Map k v
emptyM = M [] 

--COSTO:
--Propósito: agrega una asociación clave-valor al map.
assocM :: Eq k => k -> v -> Map k v -> Map k v
assocM


--COSTO:
--Propósito: encuentra un valor dado una clave.
lookupM :: Eq k => k -> Map k v -> Maybe v


--COSTO:
--Propósito: borra una asociación dada una clave.
deleteM :: Eq k => k -> Map k v -> Map k v


--COSTO:
--Propósito: devuelve las claves del map
keys :: Map k v -> [k]
